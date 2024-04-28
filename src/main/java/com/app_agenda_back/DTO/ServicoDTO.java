package com.app_agenda_back.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;

@Data
public class ServicoDTO implements Serializable {
    private static final long SerialversionUID = 1L;
    private Long servico_id;
    @NotNull(message = "O campo NOME é requerido")
    private String servico_nome;
    private Double servico_preco;
    @NotNull(message = "O campo DESCRICAO é requerido")
    private String servico_descricao;
    private String servico_informacoes_extras;
    private String servico_classificacao;

}