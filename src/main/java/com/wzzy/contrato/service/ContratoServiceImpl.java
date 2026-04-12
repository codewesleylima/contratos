package com.wzzy.contrato.service;

import com.wzzy.contrato.model.Contrato;
import com.wzzy.contrato.model.ContratoModel;
import com.wzzy.contrato.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContratoServiceImpl implements ContratoService {

    private final ContratoRepository repository;

    public ContratoServiceImpl(ContratoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ContratoModel cadastrarContrato(ContratoModel contratoModel) {
        return repository.save(contratoModel);
    }
}
