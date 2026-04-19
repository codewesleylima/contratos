package com.wzzy.contrato.mapper;

import com.wzzy.contrato.model.dto.DadoEnderecoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DadoEnderecoMapper {
    DadoEnderecoMapper paraDadosEnderecoDTO(DadoEnderecoDTO dadoEnderecoDTO);
}
