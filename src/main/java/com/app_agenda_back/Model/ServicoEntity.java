package com.app_agenda_back.Model;

import jakarta.persistence.*;

import java.io.Serializable;

public class ServicoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double preco;
    private String descricao;
    private String informacoes;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEntity categoria;

}
