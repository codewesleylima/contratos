package com.wzzy.contrato.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosContratoDTO(

        DadosPessoaisDTO dadosPessoaisDTO,
        DadosProfissionaisDTO dadosProfissionaisDTO,
        DadosEnderecoDTO dadosEnderecoDTO){
}
