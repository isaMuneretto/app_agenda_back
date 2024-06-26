package com.app_agenda_back.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class UsuarioEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioId;

    private String usuarioNome;

    @CPF
    @Column(unique = true)
    private String usuarioCpf;

    @Column(unique = true)
    private String usuarioEmail;

    @Column(unique = true)
    private String usuarioSenha;

    @JsonFormat(pattern = "yyyy/MM/dddd")
    private LocalDate usuarioDataNascimento;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER) //carregamento lento
    @JoinColumn(name = "usuario",nullable = false) //campo não pode ser nulo
    private EnderecoEntity endereco;

    @OneToMany(mappedBy = "agendamento_usuarioId", fetch = FetchType.EAGER)
    private List<AgendamentoEntity> agendamentos = new ArrayList<>();

    @OneToMany(mappedBy = "telefone_usuarioId", fetch = FetchType.EAGER)
    private List<TelefoneEntity> telefones = new ArrayList<>();

}
