package com.wzzy.contrato.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_DADOS_PROFISSIONAIS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DadosProfissionaisModel implements Serializable {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID dadosProfissionaisId;

    private String profissao;
    private String cargo;
    private String funcao;
    private String salario;
    private String departamento;
    private String dataAdmissao;
    private String salarioBruto;
    private String salarioLiquido;
    private String jornadaTrabalho;
    private String tipoContrato;


}
