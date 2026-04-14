package com.wzzy.contrato.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serializable;

@Entity
@Table(name = "TB_DADOS_PESSOAIS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DadosPessoaisModel implements Serializable {

    @Id
    @GeneratedValue
    @UuidGenerator
    private Long dadosPessoaisId;
    private String nomeCompleto;
    private String cpf;
    private String rg;
    private String dataNascimento;
    private String estadoCivil;
    private String nacionalidade;
    private String naturalidade;
}
