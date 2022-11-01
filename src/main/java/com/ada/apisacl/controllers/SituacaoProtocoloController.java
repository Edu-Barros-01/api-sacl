package com.ada.apisacl.controllers;

import com.ada.apisacl.services.SituacaoProtocoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/situacaoprotocolo")
public class SituacaoProtocoloController {

    @Autowired
    private SituacaoProtocoloService service;

    public SituacaoProtocoloController(SituacaoProtocoloService service) {
        this.service = service;
    }


}
