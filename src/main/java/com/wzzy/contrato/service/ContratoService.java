package com.wzzy.contrato.service;

import com.wzzy.contrato.model.DadoContratoModel;
import com.wzzy.contrato.model.dto.DadoContratoDTO;

public interface ContratoService {


    DadoContratoModel cadastrarDadoContrato(DadoContratoDTO dadoContratoDTO);

//    List<DadosContratoModel> buscarTodosContros();
//
//    List<DadosContratoModel> buscarContratosPorCpf(String cpf);
//
//    Optional<DadosContratoModel> buscarContratoPorNome(String nome);
}
