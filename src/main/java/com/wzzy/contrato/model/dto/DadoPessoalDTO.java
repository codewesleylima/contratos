package com.wzzy.contrato.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DadoPessoalDTO(

        @NotBlank String cpf,
        @NotBlank String nomeCompleto,
        @NotBlank String rg,
        @NotBlank String dataNascimento,
        @NotBlank String estadoCivil,
        @NotBlank String nacionalidade,
        @NotBlank String naturalidade){
}
