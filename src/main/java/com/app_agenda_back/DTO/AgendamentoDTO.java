package com.app_agenda_back.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
@Data
public class AgendamentoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long agendamento_id;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "O campo DATA_INICIO é requerido")
    private LocalDate agendamento_data_inicio = LocalDate.now();
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "O campo DATA_FIM é requerido")
    private LocalDate agendamento_data_fim = LocalDate.now();
    @NotNull(message = "O campo OBSERVACAO é requerido")
    private String agendamento_observacao;
    @NotNull(message = "O campo STATUS é requeri")
    private String agendamento_status;


}
