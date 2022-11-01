package com.ada.apisacl.dto;

import com.ada.apisacl.enums.TipoConta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.ada.apisacl.entities.Conta} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContaDto implements Serializable {
    private Integer titularConta;
    private Integer agenciaConta;
    private Long numConta;
    private TipoConta tipoConta;
}