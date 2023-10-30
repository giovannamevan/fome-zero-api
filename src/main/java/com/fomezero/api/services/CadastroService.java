package com.fomezero.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fomezero.api.dtos.CadastroDoadorDTO;
import com.fomezero.api.dtos.CadastroOngDTO;
import com.fomezero.api.entities.DoadorEntity;
import com.fomezero.api.entities.OngEntity;
import com.fomezero.api.repositories.CadastroDoadorRepository;
import com.fomezero.api.repositories.CadastroOngRepository;

import jakarta.transaction.Transactional;

@Service
public class CadastroService {

    @Autowired
    private CadastroDoadorRepository cadastroDoadorRepository;

    @Autowired
    private CadastroOngRepository cadastroOngRepository;

    @Transactional
    public void saveDoador(CadastroDoadorDTO cadastroDoadorDTO) {
        cadastroDoadorRepository.save(new DoadorEntity(cadastroDoadorDTO));
    }

    public void saveOng(CadastroOngDTO cadastroOngDTO) {
        cadastroOngRepository.save(new OngEntity(cadastroOngDTO));
    }
}
