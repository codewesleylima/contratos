package com.wzzy.contrato.model;

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

    @ManyToOne
    @JoinColumn(name = "dadosProfissionaisId")
    private DadosProfissionaisModel dadosProfissionais;

    @ManyToOne
    @JoinColumn(name = "dadosPessoaisId")
    private DadosPessoaisModel dadosPessoaisModel;

    @ManyToOne
    @JoinColumn(name = "dadosEnderecoId")
    private DadosEnderecoModel dadosEnderecoModel;

    private double valorMensal;
    private boolean status;

}
