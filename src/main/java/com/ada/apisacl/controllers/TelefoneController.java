package com.ada.apisacl.controllers;

import com.ada.apisacl.services.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/telefone")
public class TelefoneController {

    @Autowired
    private TelefoneService service;

    public TelefoneController(TelefoneService service) {
        this.service = service;
    }



}
