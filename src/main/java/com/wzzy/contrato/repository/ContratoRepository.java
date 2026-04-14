package com.wzzy.contrato.repository;

import com.wzzy.contrato.model.DadosContratoModel;
import com.wzzy.contrato.model.DadosPessoaisModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ContratoRepository extends JpaRepository<DadosContratoModel, UUID> {

    List<DadosContratoModel> findDadosContratoModelByDadosPessoaisModel_Cpf(String dadosPessoaisModelCpf);

//    Optional<DadosContratoModel> findByNomeTitular(String nomeTitular);
}
