package com.app_agenda_back.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
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
    @Column(name = "servico_id")
    private Long servico_id;

    @Column(name = "servico_nome")
    private String servico_nome;

    @Column(name = "servico_preco")
    private Double servico_preco;

    @Column(name = "servico_descricao")
    private String servico_descricao;

    @Column(name = "servico_informacoes_extras")
    private String servico_informacoes_extras;

    @Column(name = "servico_classificacao")
    private String servico_classificacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "servico_categoria_id",nullable = false)
    private CategoriaEntity categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "servico_prestador_id",nullable = false)
    private PrestadorEntity prestador;

    @OneToMany(mappedBy = "agendamento_id", fetch = FetchType.LAZY)
    private List<AgendamentoEntity> agendamentos;
}
