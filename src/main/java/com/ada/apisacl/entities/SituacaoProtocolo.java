package com.ada.apisacl.entities;

import com.ada.apisacl.enums.StatusProtocolo;
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
@Table(name = "tbl_situacao_protocolo")
public class SituacaoProtocolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStatus;

    @OneToOne
    @JoinColumn(name = "numero_protocolo_numero_protocolo")
    private Protocolo numeroProtocolo;

    @ManyToOne
    @JoinColumn(name = "cod_funcionario_cod_funcionario")
    private Funcionario codFuncionario;

    private StatusProtocolo statusProtocolo;



/*    public void setCodFuncionario(Funcionario codFuncionario) {
        this.codFuncionario = codFuncionario;
    }*/

/*    public void setNumeroProtocolo(Protocolo numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }*/


}