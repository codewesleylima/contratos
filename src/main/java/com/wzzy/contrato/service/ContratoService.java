package com.wzzy.contrato.service;

import com.wzzy.contrato.model.ContratoModel;

import java.util.List;
import java.util.Optional;

public interface ContratoService {

    ContratoModel cadastrarContrato(ContratoModel contratoModel);

    List<ContratoModel> listarContratos();

    List<ContratoModel> buscarContratosPorStatus(boolean status);

    Optional<ContratoModel> buscarContratoPorNome(String nome);
}
