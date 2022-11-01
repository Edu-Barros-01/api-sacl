package com.ada.apisacl.controllers;

import com.ada.apisacl.services.ProtocoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/protocolo")
public class ProtocoloController {

    @Autowired
    private ProtocoloService service;

    public ProtocoloController(ProtocoloService service) {
        this.service = service;
    }


}
