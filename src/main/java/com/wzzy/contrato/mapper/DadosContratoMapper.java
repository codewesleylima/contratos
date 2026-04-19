package com.wzzy.contrato.mapper;

import com.wzzy.contrato.model.DadosContratoModel;
import com.wzzy.contrato.model.dto.DadosContratoDTO;
import com.wzzy.contrato.model.dto.DadosEnderecoDTO;
import com.wzzy.contrato.model.dto.DadosProfissionaisDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {DadosPessoaisMapper.class, DadosProfissionaisMapper.class, DadosEnderecoMapper.class})
public interface DadosContratoMapper {

    @Mapping(target = "dadosPessoaisModel", source = "dadosPessoaisDTO")
    @Mapping(target = "dadosProfissionais", source = "dadosProfissionaisDTO")
    @Mapping(target = "dadosEnderecoModel", source = "dadosEnderecoDTO")
    DadosContratoModel paraDadosContratoModel(DadosContratoDTO dadosContratoDTO);

}
