package com.refecard.sistema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refecard.sistema.model.Venda;
import com.refecard.sistema.repository.VendaRepository;

import java.util.List;

@Service
public class VendaService {

    @Autowired
    private VendaRepository repository;

    public Venda salvar(Venda venda) {
        return repository.save(venda);
    }

    public List<Venda> listar() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}