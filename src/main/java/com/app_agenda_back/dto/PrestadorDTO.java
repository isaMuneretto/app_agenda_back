package com.app_agenda_back.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrestadorDTO implements Serializable {
    private static final long SerialversionUID = 1L;
    private Long prestadorId;
    @NotNull(message = "O campo NOME é requerido")
    private String prestadorNome;
    private String prestadorCnpj;
    @NotNull(message = "O campo EMAIL é requerido")
    private String prestadorEmail;
    @NotNull(message = "O campo RAZAO_SOCIAL é requerido")
    private String prestadorRazaoSocial;
    @NotNull(message = "O campo SENHA é requerido")
    private String prestadorSenha;
    @NotNull(message = "O campo CPF é requerido")
    private String prestadorCpf;
}
