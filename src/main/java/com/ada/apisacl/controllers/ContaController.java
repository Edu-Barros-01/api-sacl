package com.ada.apisacl.controllers;

import com.ada.apisacl.services.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/conta")
public class ContaController {

    @Autowired
    private ContaService service;

    public ContaController(ContaService service) {
        this.service = service;
    }


}
