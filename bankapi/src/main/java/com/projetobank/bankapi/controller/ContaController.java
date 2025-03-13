package com.projetobank.bankapi.controller;

import com.projetobank.bankapi.model.Conta;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {
    private List<Conta> contas = new ArrayList<>();

    // Endpoint para listar todas as contas
    @GetMapping
    public List<Conta> listarContas() {
        return contas;
    }

    // Endpoint para criar uma conta
    @PostMapping
    public Conta criarConta(@RequestBody Conta conta) {
        conta.setId((long) (contas.size() + 1)); // Simula um ID incremental
        contas.add(conta);
        return conta;
    }
}
