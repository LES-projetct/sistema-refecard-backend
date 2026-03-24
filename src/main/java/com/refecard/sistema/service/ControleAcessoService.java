package com.refecard.sistema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refecard.sistema.model.ControleAcesso;
import com.refecard.sistema.repository.ControleAcessoRepository;

import java.util.List;

@Service
public class ControleAcessoService {

    @Autowired
    private ControleAcessoRepository repository;

    public ControleAcesso salvar(ControleAcesso controleAcesso) {
        return repository.save(controleAcesso);
    }

    public List<ControleAcesso> listar() {
        return repository.findAll();
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}