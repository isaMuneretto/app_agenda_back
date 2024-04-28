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
    @ManyToOne
    @JoinColumn(name = "agendamento_servico_id")
    private ServicoEntity servico;
    @ManyToOne
    @JoinColumn(name = "agendamento_usuario_id")
    private UsuarioEntity usuario;

    public Long getAgendamento_id() {
        return agendamento_id;
    }

    public void setAgendamento_id(Long agendamento_id) {
        this.agendamento_id = agendamento_id;
    }

    public LocalDate getAgendamento_data_inicio() {
        return agendamento_data_inicio;
    }

    public void setAgendamento_data_inicio(LocalDate agendamento_data_inicio) {
        this.agendamento_data_inicio = agendamento_data_inicio;
    }

    public LocalDate getAgendamento_data_fim() {
        return agendamento_data_fim;
    }

    public void setAgendamento_data_fim(LocalDate agendamento_data_fim) {
        this.agendamento_data_fim = agendamento_data_fim;
    }

    public String getAgendamento_observacao() {
        return agendamento_observacao;
    }

    public void setAgendamento_observacao(String agendamento_observacao) {
        this.agendamento_observacao = agendamento_observacao;
    }

    public String getAgendamento_status() {
        return agendamento_status;
    }

    public void setAgendamento_status(String agendamento_status) {
        this.agendamento_status = agendamento_status;
    }

    public ServicoEntity getServico() {
        return servico;
    }

    public void setServico(ServicoEntity servico) {
        this.servico = servico;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }
}

