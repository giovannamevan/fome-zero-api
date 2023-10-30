package com.fomezero.api.entities;

import com.fomezero.api.dtos.CadastroOngDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OngEntity {

    public OngEntity(CadastroOngDTO cadastroOngDTO) {
        this.OngId = cadastroOngDTO.getOngId();
        this.nome_organizacao = cadastroOngDTO.getNome_organizacao();
        this.email = cadastroOngDTO.getEmail();
        this.telefone = cadastroOngDTO.getTelefone();
        this.tipo_interessado = cadastroOngDTO.getTipo_interessado();
        this.senha = cadastroOngDTO.getSenha();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long OngId;
    String nome_organizacao;
    String email;
    String telefone;
    String tipo_interessado;
    String senha;
}
