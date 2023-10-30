package com.fomezero.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fomezero.api.dtos.CadastroDoadorDTO;
import com.fomezero.api.dtos.CadastroOngDTO;
import com.fomezero.api.services.CadastroService;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    CadastroService cadastroService;

    @PostMapping("/doador")
    public void cadastroDoador(@RequestBody CadastroDoadorDTO cadastroDoadorDTO) {
        cadastroService.saveDoador(cadastroDoadorDTO);
    }

    @PostMapping("/ong")
    public void cadastroOng(@RequestBody CadastroOngDTO cadastroOngDTO) {
        cadastroService.saveOng(cadastroOngDTO);
    }
}
