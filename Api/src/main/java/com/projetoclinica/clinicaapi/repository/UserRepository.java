package com.projetoclinica.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoclinica.clinicaapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
