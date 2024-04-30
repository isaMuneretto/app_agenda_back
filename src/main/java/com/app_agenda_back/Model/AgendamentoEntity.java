package com.app_agenda_back.Model;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    @Column(name = "agendamento_id")
    private Long agendamento_id;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "agendamento_data_inicio")
    private LocalDate agendamento_data_inicio;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "agendamento_data_fim")
    private LocalDate agendamento_data_fim;
    @Column(name = "agendamento_observacao")
    private String agendamento_observacao;
    @Column(name = "agendamento_status")
    private String agendamento_status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agendamento_servico_id",nullable = false)
    private ServicoEntity servico;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agendamento_usuario_id",nullable = false)
    private UsuarioEntity usuario;

}

