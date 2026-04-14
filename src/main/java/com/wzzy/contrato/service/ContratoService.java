package com.wzzy.contrato.service;

import com.wzzy.contrato.model.DadosContratoModel;
import com.wzzy.contrato.model.dto.DadosContratoDTO;

import java.util.List;
import java.util.Optional;

public interface ContratoService {


    DadosContratoModel cadastrarContrato(DadosContratoDTO dadosContratoDTO);

    List<DadosContratoModel> buscarTodosContros();

    List<DadosContratoModel> buscarContratosPorCpf(String cpf);

    Optional<DadosContratoModel> buscarContratoPorNome(String nome);
}
