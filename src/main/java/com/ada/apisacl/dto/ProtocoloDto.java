package com.ada.apisacl.dto;

import com.ada.apisacl.enums.Canal;
import com.ada.apisacl.enums.Departamento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link com.ada.apisacl.entities.Protocolo} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProtocoloDto implements Serializable {
    private Integer numeroProtocolo;
    private ClienteDto idCliente;
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