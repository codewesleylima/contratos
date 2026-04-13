package com.wzzy.contrato.controller;

import com.wzzy.contrato.model.ContratoModel;
import com.wzzy.contrato.model.dto.ContratoDTO;
import com.wzzy.contrato.service.ContratoService;
import jakarta.validation.Valid;
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
    public ResponseEntity<ContratoModel> cadastrarContrato(@RequestBody ContratoDTO contratoDTO) {

        ContratoModel novoContrato = contratoService.cadastrarContrato(contratoDTO);
        return new ResponseEntity<>(novoContrato, HttpStatus.CREATED);
    }

    @GetMapping("/listar-todos")
    public List<ContratoModel> listarContratos() {
        return contratoService.listarContratos();
    }

    @GetMapping("/listar-status/{status}")
    public List<ContratoModel> buscarContratosPorStatus(@PathVariable boolean status) {
        return contratoService.buscarContratosPorStatus(status);
    }

    @GetMapping("/buscar-nome/{nome}")
    public Optional<ContratoModel> buscarContratosPorNome(@PathVariable String nome) {
        return contratoService.buscarContratoPorNome(nome);
    }

}
