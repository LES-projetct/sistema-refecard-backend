package com.refecard.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.refecard.sistema.model.ItemVenda;
import com.refecard.sistema.service.ItemVendaService;

import java.util.List;

@RestController
@RequestMapping("/itens-venda")
public class ItemVendaController {

    @Autowired
    private ItemVendaService service;

    @PostMapping
    public ItemVenda criar(@RequestBody ItemVenda itemVenda) {
        return service.salvar(itemVenda);
    }

    @GetMapping
    public List<ItemVenda> listar() {
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}