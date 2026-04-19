package com.wzzy.contrato.mapper;

import com.wzzy.contrato.model.DadoContratoModel;
import com.wzzy.contrato.model.dto.DadoContratoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {DadoPessoalMapper.class, DadoProfissionalMapper.class, DadoEnderecoMapper.class})
public interface DadoContratoMapper {

    @Mapping(target = "dadoPessoalModel", source = "dadoPessoalDTO")
    @Mapping(target = "dadoProfissional", source = "dadoProfissionalDTO")
    @Mapping(target = "dadoEnderecoModel", source = "dadoEnderecoDTO")
    DadoContratoModel paraDadosContratoModel(DadoContratoDTO dadoContratoDTO);

}
