package com.app_agenda_back.dto;

import com.app_agenda_back.model.EnderecoEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO implements Serializable {
    private static final long SerialversionUID = 1L;
    private Long usuarioId;
    @NotNull(message = "O campo NOME é requerido")
    private String usuarioNome;

    @CPF
    @NotNull(message = "O campo CPF é requerido")
    private Double usuarioCpf;

    @NotNull(message = "O campo EMAIL é requerido")
    private String usuarioEmail;

    @NotNull(message = "O campo SENHA é requerido")
    private String usuarioSenha;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "O campo DATA_NASCIMENTO é requerido")
    private LocalDate usuarioDataNascimento;

    @NotNull(message = "O campo ENDEREÇO_ID é requerido")
    private Long enderecoId;

    @JsonIgnore
    private EnderecoEntity usuario_enderecoId;

//    @JsonIgnore
//    private List<TelefoneDTO> telefones;
//
//    @JsonIgnore
//    private List<AgendamentoDTO> agendamentos;


}