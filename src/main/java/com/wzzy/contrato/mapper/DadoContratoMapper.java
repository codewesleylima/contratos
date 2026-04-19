package com.wzzy.contrato.mapper;

import com.wzzy.contrato.model.DadosContratoModel;
import com.wzzy.contrato.model.dto.DadoContratoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {DadoPessoalMapper.class, DadoProfissionalMapper.class, DadoEnderecoMapper.class})
public interface DadoContratoMapper {

    @Mapping(target = "dadoPessoalModel", source = "dadoPessoalDTO")
    @Mapping(target = "dadoProfissional", source = "dadoProfissionalDTO")
    @Mapping(target = "dadoEnderecoModel", source = "dadoEnderecoDTO")
    DadosContratoModel paraDadosContratoModel(DadoContratoDTO dadoContratoDTO);

}
