package com.app_agenda_back.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class CategoriaDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long categoria_id;

    @NotNull(message = "O campo NOME é requerido")
    private String categoria_nome;

    @NotNull(message = "O campo DESCRICAO é requerido")
    private String categoria_descricao;

}