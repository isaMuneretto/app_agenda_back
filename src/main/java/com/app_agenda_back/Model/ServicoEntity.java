package com.app_agenda_back.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
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
    @ManyToOne
    @JoinColumn(name = "servico_categoria_id")
    private CategoriaEntity categoria;
    @ManyToOne
    @JoinColumn(name = "servico_prestador_id")
    private PrestadorEntity prestador;
}
