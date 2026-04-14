package com.wzzy.contrato.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosEnderecoDTO (

        String rua,
        String complemento,
        @NotBlank String numero,
        @NotBlank String bairro,
        @NotBlank String cidade,
        @NotBlank String estado,
        @NotBlank String cep
        ){
}
