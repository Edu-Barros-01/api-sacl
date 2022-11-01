package com.ada.apisacl.dto;

import com.ada.apisacl.enums.Cargo;
import com.ada.apisacl.enums.Departamento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.ada.apisacl.entities.Funcionario} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioDto implements Serializable {
    private Integer codFuncionario;
    private String nomeFuncionario;
    private String emailFuncionario;
    private Departamento dptoFuncionario;
    private Cargo cargoFuncionario;
}