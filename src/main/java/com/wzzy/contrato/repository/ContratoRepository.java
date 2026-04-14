package com.wzzy.contrato.repository;

import com.wzzy.contrato.model.DadosContratoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ContratoRepository extends JpaRepository<DadosContratoModel, UUID> {

    List<DadosContratoModel> findByCpf(String cpf);

    Optional<DadosContratoModel> findByNomeTitular(String nomeTitular);
}
