package com.app_agenda_back.Model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;


public class AgendamentoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date data_inicio;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date data_fim;
    private String observacao;
    @OneToOne
    @JoinColumn(name = "servico_id")
    private ServicoEntity servicos;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuarios;

    public AgendamentoEntity() {

    }
    public AgendamentoEntity(Integer id, Date data_inicio, Date data_fim, String observacao, ServicoEntity servicos, UsuarioEntity usuarios) {
        this.id = id;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.observacao = observacao;
        this.servicos = servicos;
        this.usuarios = usuarios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public ServicoEntity getServicos() {
        return servicos;
    }

    public void setServicos(ServicoEntity servicos) {
        this.servicos = servicos;
    }

    public UsuarioEntity getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(UsuarioEntity usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgendamentoEntity that = (AgendamentoEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

