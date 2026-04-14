package com.wzzy.contrato.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosProfissionaisDTO (

        @NotBlank String profissao,
        @NotBlank String cargo,
        @NotBlank String funcao,
        @NotBlank String salario,
        @NotBlank String departamento,
        @NotBlank String dataAdmissao,
        @NotBlank String salarioBruto,
        @NotBlank String salarioLiquido,
        @NotBlank String jornadaTrabalho,
        @NotBlank String tipoContrato

        ){
}
