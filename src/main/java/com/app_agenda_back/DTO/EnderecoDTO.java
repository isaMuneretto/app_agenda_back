package com.app_agenda_back.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class EnderecoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long endereco_id;
    @NotNull(message = "O campo RUA é requerido")
    private String endereco_rua;
    @NotNull(message = "O campo CEP é requerido")
    private String endereco_cep;
    @NotNull(message = "O campo NUMERO é requerido")
    private String endereco_numero;
    private String endereco_complemento;
    @NotNull(message = "O campo CIDADE é requerido")
    private String endereco_cidade;
    @NotNull(message = "O campo ESTADO é requerido")
    private String endereco_estado;
    @NotNull(message = "O campo BAIRRO é requerido")
    private String endereco_bairro;
}
