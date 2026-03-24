package com.refecard.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.refecard.sistema.model.RecargaSaldo;
import com.refecard.sistema.service.RecargaSaldoService;

import java.util.List;

@RestController
@RequestMapping("/recargas")
public class RecargaSaldoController {

    @Autowired
    private RecargaSaldoService service;

    @PostMapping
    public RecargaSaldo criar(@RequestBody RecargaSaldo recarga) {
        return service.salvar(recarga);
    }

    @GetMapping
    public List<RecargaSaldo> listar() {
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}