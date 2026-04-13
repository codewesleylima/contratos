package com.wzzy.contrato.repository;

import com.wzzy.contrato.model.ContratoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ContratoRepository extends JpaRepository<ContratoModel, UUID> {

    List<ContratoModel> findByCpf(String cpf);

    Optional<ContratoModel> findByNomeTitular(String nomeTitular);
}
