package com.wzzy.contrato.service;

import com.wzzy.contrato.model.ContratoModel;
import com.wzzy.contrato.model.dto.ContratoDTO;
import com.wzzy.contrato.repository.ContratoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContratoServiceImpl implements ContratoService {

    private final ContratoRepository repository;

    public ContratoServiceImpl(ContratoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ContratoModel cadastrarContrato(ContratoDTO contratoDTO) {
        ContratoModel contratoModel = new ContratoModel();

        contratoModel.setCpf(contratoDTO.cpf());
        contratoModel.setNomeTitular(contratoDTO.nomeTitular());
        contratoModel.setValorMensal(contratoDTO.valorMensal());
        contratoModel.setStatus(contratoDTO.status());

        return repository.save(contratoModel);
    }

    @Override
    public List<ContratoModel> buscarTodosContros() {
        return repository.findAll();
    }

    @Override
    public List<ContratoModel> buscarContratosPorCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

    @Override
    public Optional<ContratoModel> buscarContratoPorNome(String nome) {
        return repository.findByNomeTitular(nome);
    }
}
