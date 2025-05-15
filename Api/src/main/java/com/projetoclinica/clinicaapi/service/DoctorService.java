package com.projetoclinica.clinicaapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projetoclinica.clinicaapi.model.Doctor;
import com.projetoclinica.clinicaapi.repository.DoctorRepository;

@Service
public class DoctorService {

    private final DoctorRepository repository;

    public DoctorService(DoctorRepository repository) {
        this.repository = repository;
    }

    public List<Doctor> listarTodos() {
        return repository.findAll();
    }

    public Doctor buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}
