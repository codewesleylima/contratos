package com.wzzy.contrato.repository;

import com.wzzy.contrato.model.DadoContratoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ContratoRepository extends JpaRepository<DadoContratoModel, UUID> {

    List<DadoContratoModel> findDadosContratoModelByDadoPessoalModel_Cpf(String dadosPessoaisModelCpf);

//    Optional<DadosContratoModel> findByNomeTitular(String nomeTitular);
}
