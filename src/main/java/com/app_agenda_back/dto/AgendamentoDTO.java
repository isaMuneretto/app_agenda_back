package com.app_agenda_back.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgendamentoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long agendamentoId;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "O campo DATA_INICIO é requerido")
    private LocalDate agendamentoData = LocalDate.now();

    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "O campo DATA_FIM é requerido")
    private LocalTime agendamentoHorario;

    @NotNull(message = "O campo OBSERVACAO é requerido")
    private String agendamentoObservacao;

    @NotNull(message = "O campo STATUS é requeri")
    private String agendamentoStatus;


}
