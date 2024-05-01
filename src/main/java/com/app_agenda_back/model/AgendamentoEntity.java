package com.app_agenda_back.model;

import java.io.Serializable;
import java.time.LocalDate;

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
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate agendamentoDataInicio;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate agendamentoDataFim;
    private String agendamentoObservacao;
    private String agendamentoStatus;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agendamento_servico_id",nullable = false)
    private ServicoEntity servico;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agendamento_usuario_id",nullable = false)
    private UsuarioEntity usuario;

}

