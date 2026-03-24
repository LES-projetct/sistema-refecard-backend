package com.refecard.sistema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refecard.sistema.model.RecargaSaldo;
import com.refecard.sistema.repository.RecargaSaldoRepository;

import java.util.List;

@Service
public class RecargaSaldoService {

    @Autowired
    private RecargaSaldoRepository repository;

    public RecargaSaldo salvar(RecargaSaldo recarga) {
        return repository.save(recarga);
    }

    public List<RecargaSaldo> listar() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}