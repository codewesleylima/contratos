package com.wzzy.contrato.mapper;

import com.wzzy.contrato.model.dto.DadoPessoalDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DadoPessoalMapper {
    DadoPessoalMapper paraDadosPessoaisDTO(DadoPessoalDTO dadoPessoalDTO);
}
