package com.projetoclinica.clinicaapi.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.projetoclinica.clinicaapi.model.User;
import com.projetoclinica.clinicaapi.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@Component
@Profile("dev")
public class DataBaseSeeder {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void seed() {
        // Exemplo de seeding
        if (userRepository.count() == 0) {
            var user = new User();
            user.setUsername("admin");
            user.setPassword(passwordEncoder.encode("123456"));
            user.setRole("ADMIN");
            userRepository.save(user);

            System.out.println("🌱 Banco populado com sucesso.");
        } else {
            System.out.println("✅ Banco já populado. Nenhuma ação necessária.");
        }
    }
}
