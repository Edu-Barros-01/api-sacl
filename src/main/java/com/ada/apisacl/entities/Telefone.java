package com.ada.apisacl.entities;

import com.ada.apisacl.enums.TipoTelefone;
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
@Table(name = "tbl_telefone")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTelefone;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente idCliente;

    private String dddTelefone;
    private String numeroTelefone;
    private TipoTelefone tipoTelefone;


}