package com.wzzy.contrato.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ContratoDTO(
        @NotBlank String cpf,
        @NotBlank String nomeTitular,
        @NotNull double valorMensal,
        @NotNull boolean status){
}
