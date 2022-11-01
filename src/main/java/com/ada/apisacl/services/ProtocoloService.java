package com.ada.apisacl.services;

import com.ada.apisacl.repositories.ProtocoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProtocoloService {

    @Autowired
    private ProtocoloRepository repository;


    public ProtocoloService(ProtocoloRepository repository) {
        this.repository = repository;
    }



}
