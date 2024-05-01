package com.app_agenda_back.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class UsuarioDTO implements Serializable {
    private static final long SerialversionUID = 1L;
    private Long usuarioId;
    @NotNull(message = "O campo NOME é requerido")
    private String usuarioNome;
    @NotNull(message = "O campo CPF é requerido")
    private Double usuarioCpf;
    @NotNull(message = "O campo EMAIL é requerido")
    private String usuarioEmail;
    @NotNull(message = "O campo SENHA é requerido")
    private String usuarioSenha;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "O campo DATA_NASCIMENTO é requerido")
    private String usuarioDataNascimento;


}