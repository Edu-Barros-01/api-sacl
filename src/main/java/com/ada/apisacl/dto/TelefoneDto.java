package com.ada.apisacl.dto;

import com.ada.apisacl.enums.TipoTelefone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.ada.apisacl.entities.Telefone} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TelefoneDto implements Serializable {
    private String dddTelefone;
    private String numeroTelefone;
    private TipoTelefone tipoTelefone;
}