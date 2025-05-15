package com.projetoclinica.clinicaapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoclinica.clinicaapi.model.Doctor;
import com.projetoclinica.clinicaapi.service.DoctorService;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    private final DoctorService service;

    public DoctorController(DoctorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Doctor> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Doctor buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }
}
