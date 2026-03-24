package com.refecard.sistema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refecard.sistema.model.ContaPagar;
import com.refecard.sistema.repository.ContaPagarRepository;

import java.util.List;

@Service
public class ContaPagarService {

    @Autowired
    private ContaPagarRepository repository;

    public ContaPagar salvar(ContaPagar contaPagar) {
        return repository.save(contaPagar);
    }

    public List<ContaPagar> listar() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}