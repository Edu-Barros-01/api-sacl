package com.ada.apisacl.dto;

import com.ada.apisacl.entities.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.ada.apisacl.entities.Cliente} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto implements Serializable {

    private String nomeCliente;
    private String cpfCliente;
    private String emailCliente;

    public ClienteDto(Cliente cliente) {
        this.nomeCliente = cliente.getNomeCliente();
        this.cpfCliente = cliente.getCpfCliente();
        this.emailCliente = cliente.getEmailCliente();
    }
}