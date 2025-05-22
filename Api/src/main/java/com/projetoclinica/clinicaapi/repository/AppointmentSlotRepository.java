package com.projetoclinica.clinicaapi.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoclinica.clinicaapi.repository.AppointmentSlot;

public interface AppointmentSlotRepository extends JpaRepository<AppointmentSlot, Long> {
    List<AppointmentSlot> findByDoctorIdAndData(Long doctorId, LocalDate data);
}
