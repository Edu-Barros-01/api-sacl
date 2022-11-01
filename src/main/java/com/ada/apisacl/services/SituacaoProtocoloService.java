package com.ada.apisacl.services;

import com.ada.apisacl.repositories.SituacaoProtocoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SituacaoProtocoloService {

    @Autowired
    private SituacaoProtocoloRepository repository;


    public SituacaoProtocoloService(SituacaoProtocoloRepository repository) {
        this.repository = repository;
    }


}
