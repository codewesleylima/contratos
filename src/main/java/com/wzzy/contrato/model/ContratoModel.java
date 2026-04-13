package com.wzzy.contrato.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_CONTRATOS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContratoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID contratoId;

    private String cpf;
    private String nomeTitular;
    private double valorMensal;
    private boolean status;

}
