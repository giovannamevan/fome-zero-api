package com.fomezero.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long produtoId;
    String nome_produto;
    int quantidade_por_caixa;
    int quantidade_de_caixas;
    String validade;
    String telefone_contato;
    String endereco;
}
