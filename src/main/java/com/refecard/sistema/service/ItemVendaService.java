package com.refecard.sistema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refecard.sistema.model.ItemVenda;
import com.refecard.sistema.repository.ItemVendaRepository;

import java.util.List;

@Service
public class ItemVendaService {

    @Autowired
    private ItemVendaRepository repository;

    public ItemVenda salvar(ItemVenda itemVenda) {
        return repository.save(itemVenda);
    }

    public List<ItemVenda> listar() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}