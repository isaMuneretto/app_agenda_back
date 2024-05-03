package com.app_agenda_back.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import com.app_agenda_back.enuns.AgendamentoStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "agendamento")
public class AgendamentoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long agendamentoId;
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate agendamentoData;
    @Temporal(TemporalType.TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
    private LocalTime agendamentoHorario;
    private String agendamentoObservacao;
    @Enumerated(EnumType.STRING)
    private AgendamentoStatus agendamentoStatus;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agendamento_servicoId",nullable = false)
    private ServicoEntity agendamento_servicoId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agendamento_usuarioId",nullable = false)
    private UsuarioEntity agendamento_usuarioId;

}

