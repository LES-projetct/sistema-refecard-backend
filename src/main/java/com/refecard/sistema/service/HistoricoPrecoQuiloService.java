package com.refecard.sistema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refecard.sistema.model.HistoricoPrecoQuilo;
import com.refecard.sistema.repository.HistoricoPrecoQuiloRepository;

import java.util.List;

@Service
public class HistoricoPrecoQuiloService {

    @Autowired
    private HistoricoPrecoQuiloRepository repository;

    public HistoricoPrecoQuilo salvar(HistoricoPrecoQuilo historico) {
        return repository.save(historico);
    }

    public List<HistoricoPrecoQuilo> listar() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}