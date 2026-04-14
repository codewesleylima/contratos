package com.wzzy.contrato.controller;

import com.wzzy.contrato.model.DadosContratoModel;
import com.wzzy.contrato.model.dto.DadosContratoDTO;
import com.wzzy.contrato.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/contratos")
public class ContratoController {

    private final ContratoService contratoService;

    @Autowired
    public ContratoController(ContratoService contratoService) {
        this.contratoService = contratoService;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<DadosContratoModel> cadastrarContrato(@RequestBody DadosContratoDTO dadosContratoDTO) {

        DadosContratoModel novoContrato = contratoService.cadastrarContrato(dadosContratoDTO);
        return new ResponseEntity<>(novoContrato, HttpStatus.CREATED);
    }

    @GetMapping("/buscar-todos")
    public List<DadosContratoModel> buscarTodosContratos() {
        return contratoService.buscarTodosContros();
    }

    @GetMapping("/buscar-cpf/{cpf}")
    public List<DadosContratoModel> buscarContratosPorStatus(@PathVariable String cpf) {
        return contratoService.buscarContratosPorCpf(cpf);
    }

    @GetMapping("/buscar-nome/{nome}")
    public Optional<DadosContratoModel> buscarContratosPorNome(@PathVariable String nome) {
        return contratoService.buscarContratoPorNome(nome);
    }

}
