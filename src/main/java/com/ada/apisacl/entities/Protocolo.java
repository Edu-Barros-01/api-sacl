package com.ada.apisacl.entities;

import com.ada.apisacl.enums.Canal;
import com.ada.apisacl.enums.Departamento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "tbl_protocolo")
public class Protocolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numeroProtocolo;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente idCliente;

    private String descricaoProtocolo;
    private LocalDateTime dataAberturaProtocolo;
    private LocalDateTime dataPrazoProtocolo;
    private LocalDateTime dataRecebimentoProtocolo;
    private LocalDateTime dataInicioProtocolo;
    private LocalDateTime dataFimProtocolo;
    private LocalDateTime dataHoraUltimaAcaoProtocolo;
    private boolean propensaoBacenProtocolo;
    private boolean agilizarProtocolo;
    private boolean procedenteProtocolo;
    private boolean devidoProtocolo;
    private Canal canalProtocolo;
    private Departamento dptoResponsavelProtocolo;

}