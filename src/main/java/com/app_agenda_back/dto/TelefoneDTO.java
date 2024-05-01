package com.app_agenda_back.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class TelefoneDTO implements Serializable {
    private static final long SerialversionUID = 1L;
    private Long telefoneId;
    @NotNull(message = "O campo NUMERO é requerido")
    private String telefoneNumero;

}
