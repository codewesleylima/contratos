package com.wzzy.contrato.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosContratoDTO(
        @NotBlank String cpf,
        @NotBlank String nomeCompleto,
        @NotNull double valorMensal,
        @NotNull boolean status){
}
