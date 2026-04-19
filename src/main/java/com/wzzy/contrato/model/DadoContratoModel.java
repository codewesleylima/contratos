package com.wzzy.contrato.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_DADOS_CONTRATOS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DadoContratoModel implements Serializable {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID dadosContratoId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dadosProfissionaisId")
    @JsonProperty("dadosProfissionais")
    private DadoProfissionalModel dadosProfissionais;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dadosPessoaisId")
    @JsonProperty("dadosPessoais")
    private DadoPessoalModel dadoPessoalModel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dadosEnderecoId")
    @JsonProperty("dadosEndereco")
    private DadoEnderecoModel dadoEnderecoModel;

    private double valorMensal;
    private boolean status;

}
