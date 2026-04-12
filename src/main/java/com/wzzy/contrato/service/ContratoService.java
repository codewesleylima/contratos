package com.wzzy.contrato.service;

import com.wzzy.contrato.model.ContratoModel;

import java.util.List;

public interface ContratoService {

    ContratoModel cadastrarContrato(ContratoModel contratoModel);

    List<ContratoModel> listarContratos();
}
