package com.refecard.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.refecard.sistema.model.Cartao;
import com.refecard.sistema.service.CartaoService;

import java.util.List;

@RestController
@RequestMapping("/cartoes")
public class CartaoController {

    @Autowired
    private CartaoService service;

    @PostMapping
    public Cartao criar(@RequestBody Cartao cartao) {
        return service.salvar(cartao);
    }

    @GetMapping
    public List<Cartao> listar() {
        return service.listar();
    }

    @GetMapping("/codigo/{codigo}")
    public Cartao buscarPorCodigo(@PathVariable String codigo) {
        return service.buscarPorCodigo(codigo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}