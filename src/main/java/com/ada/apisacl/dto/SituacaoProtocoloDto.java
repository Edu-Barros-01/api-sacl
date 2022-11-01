package com.ada.apisacl.dto;

import com.ada.apisacl.enums.StatusProtocolo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link com.ada.apisacl.entities.SituacaoProtocolo} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SituacaoProtocoloDto implements Serializable {
    private StatusProtocolo statusProtocolo;
}