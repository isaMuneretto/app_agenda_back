package com.app_agenda_back.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class CategoriaDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long categoriaId;

    @NotNull(message = "O campo NOME é requerido")
    private String categoriaNome;

    @NotNull(message = "O campo DESCRICAO é requerido")
    private String categoriaDescricao;

}