package com.app_agenda_back.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class UsuarioDTO implements Serializable {
    private static final long SerialversionUID = 1L;
    private Long usuario_id;
    @NotNull(message = "O campo NOME é requerido")
    private String usuario_nome;
    @NotNull(message = "O campo CPF é requerido")
    private Double usuario_cpf;
    @NotNull(message = "O campo EMAIL é requerido")
    private String usuario_email;
    @NotNull(message = "O campo SENHA é requerido")
    private String usuario_senha;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "O campo DATA_NASCIMENTO é requerido")
    private String usuario_data_nascimento_;


}