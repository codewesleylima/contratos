package com.wzzy.contrato.mapper;

import com.wzzy.contrato.model.dto.DadosEnderecoDTO;
import com.wzzy.contrato.model.dto.DadosProfissionaisDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DadosProfissionaisMapper {
    DadosProfissionaisMapper paraDadosProfissionaisDTO(DadosProfissionaisDTO dadosProfissionaisDTO);
}
