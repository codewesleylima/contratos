package com.wzzy.contrato.mapper;

import com.wzzy.contrato.model.dto.DadosPessoaisDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DadosPessoaisMapper {
    DadosPessoaisMapper paraDadosPessoaisDTO(DadosPessoaisDTO dadosPessoaisDTO);
}
