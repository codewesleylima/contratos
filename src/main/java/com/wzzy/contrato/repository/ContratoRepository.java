package com.wzzy.contrato.repository;

import com.wzzy.contrato.model.ContratoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContratoRepository extends JpaRepository<ContratoModel, Long> {

    List<ContratoModel> findByAtivo(boolean ativo);

    List<ContratoModel> findByNomeTitular(String nomeTitular);
}
