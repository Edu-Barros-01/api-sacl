package com.ada.apisacl.entities;

import com.ada.apisacl.enums.TipoConta;
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
@Table(name = "tbl_conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConta;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente idCliente;

    private Integer titularConta;
    private Integer agenciaConta;
    private Long numConta;
    private TipoConta tipoConta;


/*    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }*/

}