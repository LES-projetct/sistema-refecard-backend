package com.refecard.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.refecard.sistema.model.ContaReceber;
import com.refecard.sistema.service.ContaReceberService;

import java.util.List;

@RestController
@RequestMapping("/contas-receber")
public class ContaReceberController {

    @Autowired
    private ContaReceberService service;

    @PostMapping
    public ContaReceber criar(@RequestBody ContaReceber contaReceber) {
        return service.salvar(contaReceber);
    }

    @GetMapping
    public List<ContaReceber> listar() {
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}