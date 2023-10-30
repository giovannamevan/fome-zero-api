package com.fomezero.api.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CadastroOngDTO {
    Long OngId;
    String nome_organizacao;
    String email;
    String telefone;
    String tipo_interessado;
    String senha;
}
