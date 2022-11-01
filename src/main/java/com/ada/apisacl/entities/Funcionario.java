package com.ada.apisacl.entities;

import com.ada.apisacl.enums.Cargo;
import com.ada.apisacl.enums.Departamento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "tbl_funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codFuncionario;

    private String nomeFuncionario;
    private String emailFuncionario;
    private Departamento dptoFuncionario;
    private Cargo cargoFuncionario;

}