package com.wzzy.contrato.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wzzy.contrato.model.dto.DadosProfissionaisDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_DADOS_CONTRATOS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DadosContratoModel implements Serializable {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID dadosContratoId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dadosProfissionaisId")
    @JsonProperty("dadosProfissionais")
    private DadosProfissionaisModel dadosProfissionais;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dadosPessoaisId")
    @JsonProperty("dadosPessoais")
    private DadosPessoaisModel dadosPessoaisModel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dadosEnderecoId")
    @JsonProperty("dadosEndereco")
    private DadosEnderecoModel dadosEnderecoModel;

    private double valorMensal;
    private boolean status;

}
