package com.wzzy.contrato.service;

import com.wzzy.contrato.model.DadosContratoModel;
import com.wzzy.contrato.model.DadosEnderecoModel;
import com.wzzy.contrato.model.DadosPessoaisModel;
import com.wzzy.contrato.model.DadosProfissionaisModel;
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
        dadosContratoModel.setDadosPessoaisModel(new DadosPessoaisModel());
        dadosContratoModel.setDadosProfissionais(new DadosProfissionaisModel());
        dadosContratoModel.setDadosEnderecoModel(new DadosEnderecoModel());

        // Dados Pessoais
        dadosContratoModel.getDadosPessoaisModel().setCpf(dadosContratoDTO.dadosPessoaisDTO().cpf());
        dadosContratoModel.getDadosPessoaisModel().setNomeCompleto(dadosContratoDTO.dadosPessoaisDTO().nomeCompleto());
        dadosContratoModel.getDadosPessoaisModel().setRg(dadosContratoDTO.dadosPessoaisDTO().rg());
        dadosContratoModel.getDadosPessoaisModel().setDataNascimento(dadosContratoDTO.dadosPessoaisDTO().dataNascimento());
        dadosContratoModel.getDadosPessoaisModel().setEstadoCivil(dadosContratoDTO.dadosPessoaisDTO().estadoCivil());
        dadosContratoModel.getDadosPessoaisModel().setDataNascimento(dadosContratoDTO.dadosPessoaisDTO().nacionalidade());
        dadosContratoModel.getDadosPessoaisModel().setNaturalidade(dadosContratoDTO.dadosPessoaisDTO().naturalidade());

        // Dados Profissionais
        dadosContratoModel.getDadosProfissionais().setProfissao(dadosContratoDTO.dadosProfissionaisDTO().profissao());
        dadosContratoModel.getDadosProfissionais().setCargo(dadosContratoDTO.dadosProfissionaisDTO().cargo());
        dadosContratoModel.getDadosProfissionais().setFuncao(dadosContratoDTO.dadosProfissionaisDTO().funcao());
        dadosContratoModel.getDadosProfissionais().setSalario(dadosContratoDTO.dadosProfissionaisDTO().salario());
        dadosContratoModel.getDadosProfissionais().setDepartamento(dadosContratoDTO.dadosProfissionaisDTO().departamento());
        dadosContratoModel.getDadosProfissionais().setDataAdmissao(dadosContratoDTO.dadosProfissionaisDTO().dataAdmissao());
        dadosContratoModel.getDadosProfissionais().setSalarioBruto(dadosContratoDTO.dadosProfissionaisDTO().salarioBruto());
        dadosContratoModel.getDadosProfissionais().setSalarioLiquido(dadosContratoDTO.dadosProfissionaisDTO().salarioLiquido());
        dadosContratoModel.getDadosProfissionais().setJornadaTrabalho(dadosContratoDTO.dadosProfissionaisDTO().jornadaTrabalho());
        dadosContratoModel.getDadosProfissionais().setTipoContrato(dadosContratoDTO.dadosProfissionaisDTO().tipoContrato());

        // Dados Endereco
        dadosContratoModel.getDadosEnderecoModel().setRua(dadosContratoDTO.dadosEnderecoDTO().rua());
        dadosContratoModel.getDadosEnderecoModel().setNumero(dadosContratoDTO.dadosEnderecoDTO().numero());
        dadosContratoModel.getDadosEnderecoModel().setComplemento(dadosContratoDTO.dadosEnderecoDTO().complemento());
        dadosContratoModel.getDadosEnderecoModel().setBairro(dadosContratoDTO.dadosEnderecoDTO().bairro());
        dadosContratoModel.getDadosEnderecoModel().setCidade(dadosContratoDTO.dadosEnderecoDTO().cidade());
        dadosContratoModel.getDadosEnderecoModel().setEstado(dadosContratoDTO.dadosEnderecoDTO().estado());
        dadosContratoModel.getDadosEnderecoModel().setCep(dadosContratoDTO.dadosEnderecoDTO().cep());


        return repository.save(dadosContratoModel);
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
}
