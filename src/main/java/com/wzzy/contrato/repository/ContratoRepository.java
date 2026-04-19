package com.wzzy.contrato.repository;

import com.wzzy.contrato.model.DadosContratoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ContratoRepository extends JpaRepository<DadosContratoModel, UUID> {

    List<DadosContratoModel> findDadosContratoModelByDadoPessoalModel_Cpf(String dadosPessoaisModelCpf);

//    Optional<DadosContratoModel> findByNomeTitular(String nomeTitular);
}
