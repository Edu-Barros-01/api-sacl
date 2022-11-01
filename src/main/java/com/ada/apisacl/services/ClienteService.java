package com.ada.apisacl.services;

import com.ada.apisacl.dto.ClienteDto;
import com.ada.apisacl.entities.Cliente;
import com.ada.apisacl.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }


    public ClienteDto findById(Integer id){
        Cliente entidade = repository.findById(id).orElseThrow();
        ClienteDto dto = new ClienteDto(entidade);
        return dto;
    }

}
