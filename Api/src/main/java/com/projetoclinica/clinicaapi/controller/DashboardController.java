package com.projetoclinica.clinicaapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.projetoclinica.clinicaapi.service.AiAnaliseService;

@RestController
public class DashboardController {

    @Autowired
    private AiAnaliseService service;

    @GetMapping("dashboard")
    public String analise(@RequestParam String lang){
        return service.getExpenseAnalise(lang);
    }
    
}