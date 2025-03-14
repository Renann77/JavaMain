package br.com.fiap.bank_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IntegrantesController {
    @GetMapping
    public String index(){
        return "Igor Dias Barrocal, 555217 /  Renan Dorneles 557820"
    }
}