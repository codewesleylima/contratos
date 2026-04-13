package com.wzzy.contrato.repository;

import com.wzzy.contrato.model.ContratoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ContratoRepository extends JpaRepository<ContratoModel, Long> {

    List<ContratoModel> findByStatus(boolean status);

    Optional<ContratoModel> findByNomeTitular(String nomeTitular);
}
