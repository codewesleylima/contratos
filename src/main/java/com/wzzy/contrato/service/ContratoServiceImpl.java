package com.wzzy.contrato.service;

import com.wzzy.contrato.mapper.DadosContratoMapper;
import com.wzzy.contrato.model.DadosContratoModel;
import com.wzzy.contrato.model.DadosEnderecoModel;
import com.wzzy.contrato.model.DadosPessoaisModel;
import com.wzzy.contrato.model.DadosProfissionaisModel;
import com.wzzy.contrato.model.dto.DadosContratoDTO;
import com.wzzy.contrato.repository.ContratoRepository;
import org.springframework.stereotype.Service;

@Service
public class ContratoServiceImpl implements ContratoService {

    private final ContratoRepository repository;
    private final DadosContratoMapper dadosContratoMapper;

    public ContratoServiceImpl(ContratoRepository repository, DadosContratoMapper dadosContratoMapper) {
        this.repository = repository;
        this.dadosContratoMapper = dadosContratoMapper;
    }

    @Override
    public DadosContratoModel cadastrarContrato(DadosContratoDTO dadosContratoDTO) {

        DadosContratoModel dadosContratoModel = dadosContratoMapper.paraDadosContratoModel(dadosContratoDTO);
            return repository.save(dadosContratoModel);
        }
    }

//    @Override
//    public List<DadosContratoModel> buscarTodosContros() {
//        return repository.findAll();
//    }
//
//    @Override
//    public List<DadosContratoModel> buscarContratosPorCpf(DadosContratoDTO dadosContratoDTO) {
//
//        DadosContratoModel dadosContratoModel = new DadosContratoModel(dadosContratoDTO().g)
//        return repository.findDadosContratoModelByDadosPessoaisModel_Cpf(dadosContratoDTO);
//    }
//
//    @Override
//    public Optional<DadosContratoModel> buscarContratoPorNome(String nome) {
//        return repository.findByNomeTitular(nome);
//    }

