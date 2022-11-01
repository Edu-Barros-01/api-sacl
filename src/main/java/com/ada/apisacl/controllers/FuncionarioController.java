package com.ada.apisacl.controllers;

import com.ada.apisacl.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    public FuncionarioController(FuncionarioService service) {
        this.service = service;
    }


}
