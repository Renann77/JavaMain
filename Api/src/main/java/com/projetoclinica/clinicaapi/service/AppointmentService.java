package com.projetoclinica.clinicaapi.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.projetoclinica.clinicaapi.model.AppointmentSlot;
import com.projetoclinica.clinicaapi.repository.AppointmentSlotRepository;

@Service
public class AppointmentService {

    private final AppointmentSlotRepository repository;

    public AppointmentService(AppointmentSlotRepository repository) {
        this.repository = repository;
    }

    public List<AppointmentSlot> listarHorariosPorMedicoEData(Long doctorId, LocalDate data) {
        return repository.findByDoctorIdAndData(doctorId, data);
    }

    public AppointmentSlot agendarHorario(Long slotId) {
        AppointmentSlot slot = repository.findById(slotId).orElseThrow();
        slot.setDisponivel(false);
        return repository.save(slot);
    }
}
