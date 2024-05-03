package com.app_agenda_back.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServicoDTO implements Serializable {
    private static final long SerialversionUID = 1L;
    private Long servicoId;
    @NotNull(message = "O campo NOME é requerido")
    private String servicoNome;
    private Double servicoPreco;
    @NotNull(message = "O campo DESCRICAO é requerido")
    private String servicoDescricao;
    private String servicoInformacoesExtras;
    private String servicoClassificacao;

}