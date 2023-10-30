package com.fomezero.api.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fomezero.api.dtos.CadastroDoadorDTO;

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
@EntityScan(basePackages = "com.fomezero.entities")
public class DoadorEntity {
  public DoadorEntity(CadastroDoadorDTO cadastroDoadorDTO) {
    this.doadorId = cadastroDoadorDTO.getDoadorId();
    this.nome_empresa = cadastroDoadorDTO.getNome_empresa();
    this.email = cadastroDoadorDTO.getEmail();
    this.endereco = cadastroDoadorDTO.getEndereco();
    this.telefone = cadastroDoadorDTO.getTelefone();
    this.senha = cadastroDoadorDTO.getSenha();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long doadorId;
  String nome_empresa;
  String email;
  String endereco;
  String telefone;
  String senha;
}
