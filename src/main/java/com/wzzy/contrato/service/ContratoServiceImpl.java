package com.wzzy.contrato.service;

import com.wzzy.contrato.mapper.DadoContratoMapper;
import com.wzzy.contrato.model.DadoContratoModel;
import com.wzzy.contrato.model.dto.DadoContratoDTO;
import com.wzzy.contrato.repository.ContratoRepository;
import org.springframework.stereotype.Service;

@Service
public class ContratoServiceImpl implements ContratoService {

    private final ContratoRepository repository;
    private final DadoContratoMapper dadoContratoMapper;

    public ContratoServiceImpl(ContratoRepository repository, DadoContratoMapper dadoContratoMapper) {
        this.repository = repository;
        this.dadoContratoMapper = dadoContratoMapper;
    }

    @Override
    public DadoContratoModel cadastrarDadoContrato(DadoContratoDTO dadoContratoDTO) {

        DadoContratoModel dadoContratoModel = dadoContratoMapper.paraDadosContratoModel(dadoContratoDTO);
            return repository.save(dadoContratoModel);
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

