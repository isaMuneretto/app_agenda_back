package com.app_agenda_back.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "servico")
public class ServicoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long servicoId;

    private String servicoNome;

    private Double servicoPreco;

    private String servicoDescricao;

    private String servicoInformacoesExtras;

    private String servicoClassificacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "servico_categoriaId",nullable = false)
    private CategoriaEntity servico_categoriaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "servico_prestadorId",nullable = false)
    private PrestadorEntity servico_prestadorId;

    @OneToMany(mappedBy = "agendamentoId", fetch = FetchType.LAZY)
    private List<AgendamentoEntity> agendamentos = new ArrayList<>();
}
