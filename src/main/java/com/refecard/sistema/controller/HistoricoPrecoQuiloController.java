package com.refecard.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.refecard.sistema.model.HistoricoPrecoQuilo;
import com.refecard.sistema.service.HistoricoPrecoQuiloService;

import java.util.List;

@RestController
@RequestMapping("/historico-preco-quilo")
public class HistoricoPrecoQuiloController {

    @Autowired
    private HistoricoPrecoQuiloService service;

    @PostMapping
    public HistoricoPrecoQuilo criar(@RequestBody HistoricoPrecoQuilo historico) {
        return service.salvar(historico);
    }

    @GetMapping
    public List<HistoricoPrecoQuilo> listar() {
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}