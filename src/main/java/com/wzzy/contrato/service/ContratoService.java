package com.wzzy.contrato.service;

import com.wzzy.contrato.model.ContratoModel;
import com.wzzy.contrato.model.dto.ContratoDTO;

import java.util.List;
import java.util.Optional;

public interface ContratoService {


    ContratoModel cadastrarContrato(ContratoDTO contratoDTO);

    List<ContratoModel> listarContratos();

    List<ContratoModel> buscarContratosPorStatus(boolean status);

    Optional<ContratoModel> buscarContratoPorNome(String nome);
}
