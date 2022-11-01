package com.ada.apisacl.controllers;

import com.ada.apisacl.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;


    public ClienteController(ClienteService service) {
        this.service = service;
    }



}
