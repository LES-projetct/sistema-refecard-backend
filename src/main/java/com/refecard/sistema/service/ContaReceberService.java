package com.refecard.sistema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refecard.sistema.model.ContaReceber;
import com.refecard.sistema.repository.ContaReceberRepository;

import java.util.List;

@Service
public class ContaReceberService {

    @Autowired
    private ContaReceberRepository repository;

    public ContaReceber salvar(ContaReceber contaReceber) {
        return repository.save(contaReceber);
    }

    public List<ContaReceber> listar() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}