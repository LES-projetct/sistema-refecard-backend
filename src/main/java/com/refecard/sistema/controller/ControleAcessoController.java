package com.refecard.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.refecard.sistema.model.ControleAcesso;
import com.refecard.sistema.service.ControleAcessoService;

import java.util.List;

@RestController
@RequestMapping("/controle-acessos")
public class ControleAcessoController {

    @Autowired
    private ControleAcessoService service;

    @PostMapping
    public ControleAcesso criar(@RequestBody ControleAcesso controleAcesso) {
        return service.salvar(controleAcesso);
    }

    @GetMapping
    public List<ControleAcesso> listar() {
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}