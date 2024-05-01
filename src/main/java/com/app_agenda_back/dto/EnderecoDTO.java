package com.app_agenda_back.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class EnderecoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long enderecoId;
    @NotNull(message = "O campo RUA é requerido")
    private String enderecoRua;
    @NotNull(message = "O campo CEP é requerido")
    private String enderecoCep;
    @NotNull(message = "O campo NUMERO é requerido")
    private String enderecoNumero;
    private String enderecoComplemento;
    @NotNull(message = "O campo CIDADE é requerido")
    private String enderecoCidade;
    @NotNull(message = "O campo ESTADO é requerido")
    private String enderecoEstado;
    @NotNull(message = "O campo BAIRRO é requerido")
    private String enderecoBairro;
}