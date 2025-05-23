package com.projetoclinica.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoclinica.clinicaapi.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
