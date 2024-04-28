package com.app_agenda_back.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class TelefoneDTO implements Serializable {
    private static final long SerialversionUID = 1L;
    private Long telefone_id;
    @NotNull(message = "O campo NUMERO é requerido")
    private String telefone_numero;

}
