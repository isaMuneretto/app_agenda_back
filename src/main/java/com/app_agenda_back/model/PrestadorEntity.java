package com.app_agenda_back.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prestador")
public class PrestadorEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prestadorId;

    private String prestadorNome;

    @CPF
    private String prestadorCpf;

    @CNPJ
    @Column(unique = true)
    private String prestadorCnpj;

    @Column(unique = true)
    private String prestadorEmail;

    private String prestadorSenha;

    private String prestadorRazaoSocial;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prestador_enderecoId", nullable = false)
    private EnderecoEntity endereco;

    @OneToMany(mappedBy = "telefoneId", fetch = FetchType.LAZY)
    private List<TelefoneEntity> telefones = new ArrayList<>();

    @OneToMany(mappedBy = "servicoId", fetch = FetchType.LAZY)
    private List<ServicoEntity> servicos = new ArrayList<>();
}
