package com.projetoclinica.clinicaapi.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projetoclinica.clinicaapi.model.AppointmentSlot;
import com.projetoclinica.clinicaapi.service.AppointmentService;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @GetMapping("/doctor/{id}/slots")
    public List<AppointmentSlot> listarHorariosDisponiveis(
            @PathVariable Long id,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate data) {
        return service.listarHorariosPorMedicoEData(id, data);
    }

    @PostMapping("/book/{slotId}")
    public AppointmentSlot agendar(@PathVariable Long slotId) {
        return service.agendarHorario(slotId);
    }
}
