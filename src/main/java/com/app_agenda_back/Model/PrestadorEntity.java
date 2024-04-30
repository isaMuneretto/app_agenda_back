package com.app_agenda_back.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prestador")
public class PrestadorEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prestador_id")
    private Long prestador_id;

    @Column(name = "prestador_nome")
    private String prestador_nome;

    @CPF
    @Column(name = "prestador_cpf")
    private String prestador_cpf;

    @CNPJ
    @Column(name = "prestador_cnpj", unique = true)
    private String prestador_cnpj;

    @Column(name = "prestador_email", unique = true)
    private String prestador_email;

    @Column(name = "prestador_senha")
    private String prestador_senha;

    @Column(name = "prestador_razao_social")
    private String prestador_razao_social;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prestador_endereco_id", nullable = false)
    private EnderecoEntity endereco;

    @OneToMany(mappedBy = "telefone_id", fetch = FetchType.LAZY)
    private List<TelefoneEntity> telefones;

    @OneToMany(mappedBy = "servico_id", fetch = FetchType.LAZY)
    private List<ServicoEntity> servicos;
}
