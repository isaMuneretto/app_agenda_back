package com.app_agenda_back.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class PrestadorDTO implements Serializable {
    private static final long SerialversionUID = 1L;
    private Long prestador_id;
    @NotNull(message = "O campo NOME é requerido")
    private String prestador_nome;
    private String prestador_cnpj;
    @NotNull(message = "O campo EMAIL é requerido")
    private String prestador_email;
    @NotNull(message = "O campo RAZAO_SOCIAL é requerido")
    private String prestador_razao_social;
    @NotNull(message = "O campo SENHA é requerido")
    private String prestador_senha;
    @NotNull(message = "O campo CPF é requerido")
    private String prestador_cpf;
}
