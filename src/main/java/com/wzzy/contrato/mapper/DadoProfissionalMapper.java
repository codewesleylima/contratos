package com.wzzy.contrato.mapper;

import com.wzzy.contrato.model.dto.DadoProfissionalDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DadoProfissionalMapper {
    DadoProfissionalMapper paraDadosProfissionaisDTO(DadoProfissionalDTO dadoProfissionalDTO);
}
