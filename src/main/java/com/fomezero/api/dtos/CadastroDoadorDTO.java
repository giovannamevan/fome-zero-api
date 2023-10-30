package com.fomezero.api.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CadastroDoadorDTO {
    Long doadorId;
    String nome_empresa;
    String email;
    String endereco;
    String telefone;
    String senha;
}
