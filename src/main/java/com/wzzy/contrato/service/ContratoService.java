package com.wzzy.contrato.service;

import com.wzzy.contrato.model.DadosContratoModel;
import com.wzzy.contrato.model.dto.DadoContratoDTO;

public interface ContratoService {


    DadosContratoModel cadastrarDadoContrato(DadoContratoDTO dadoContratoDTO);

//    List<DadosContratoModel> buscarTodosContros();
//
//    List<DadosContratoModel> buscarContratosPorCpf(String cpf);
//
//    Optional<DadosContratoModel> buscarContratoPorNome(String nome);
}
