package com.wzzy.contrato.controller;

import com.wzzy.contrato.model.ContratoModel;
import com.wzzy.contrato.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/contratos")
public class ContratoController {

    private final ContratoService contratoService;

    @Autowired
    public ContratoController(ContratoService contratoService) {
        this.contratoService = contratoService;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<ContratoModel> cadastrarContrato(@RequestBody ContratoModel contratoModel) {

        ContratoModel novoContrato = contratoService.cadastrarContrato(contratoModel);
        return new ResponseEntity<>(novoContrato, HttpStatus.CREATED);
    }

    @GetMapping("/listar-todos")
    public List<ContratoModel> listarContratos() {
        return contratoService.listarContratos();
    }

}
