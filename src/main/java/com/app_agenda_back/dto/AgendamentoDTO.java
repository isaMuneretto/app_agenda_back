package com.app_agenda_back.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
@Data
public class AgendamentoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long agendamentoId;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "O campo DATA_INICIO é requerido")
    private LocalDate agendamentoDataInicio = LocalDate.now();
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "O campo DATA_FIM é requerido")
    private LocalDate agendamentoDataFim = LocalDate.now();
    @NotNull(message = "O campo OBSERVACAO é requerido")
    private String agendamentoObservacao;
    @NotNull(message = "O campo STATUS é requeri")
    private String agendamentoStatus;


}
