package com.ada.apisacl.services;

import com.ada.apisacl.repositories.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    @Autowired
    private ContaRepository repository;

    public ContaService(ContaRepository repository) {
        this.repository = repository;
    }



}
