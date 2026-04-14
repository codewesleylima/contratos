package com.wzzy.contrato.service;

import com.wzzy.contrato.model.DadosContratoModel;
import com.wzzy.contrato.model.dto.DadosContratoDTO;
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
    public DadosContratoModel cadastrarContrato(DadosContratoDTO dadosContratoDTO) {
        DadosContratoModel dadosContratoModel = new DadosContratoModel();

        dadosContratoModel.getDadosPessoaisModel().setCpf(dadosContratoDTO.cpf());
        dadosContratoModel.getDadosPessoaisModel().setNomeCompleto(dadosContratoDTO.nomeTitular());
        dadosContratoModel.setValorMensal(dadosContratoDTO.valorMensal());
        dadosContratoModel.setStatus(dadosContratoDTO.status());

        return repository.save(dadosContratoModel);
    }

    @Override
    public List<DadosContratoModel> buscarTodosContros() {
        return repository.findAll();
    }

    @Override
    public List<DadosContratoModel> buscarContratosPorCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

    @Override
    public Optional<DadosContratoModel> buscarContratoPorNome(String nome) {
        return repository.findByNomeTitular(nome);
    }
}
