package com.app_agenda_back.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
import java.time.LocalDate;
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
    @Column(name = "usuario_id")
    private Long usuario_id;

    @Column(name = "usuario_nome")
    private String usuario_nome;

    @CPF
    @Column(name = "usuario_cpf", unique = true)
    private String usuario_cpf;

    @Column(name = "usuario_email", unique = true)
    private String usuario_email;

    @Column(name = "usuario_senha", unique = true)
    private String usuario_senha;

    @Column(name = "usuario_dataNascimento")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate usuario_dataNascimento;

    @ManyToOne(fetch = FetchType.LAZY) //carregamento lento
    @JoinColumn(name = "usuario_endereco_id",nullable = false) //campo não pode ser nulo
    private EnderecoEntity endereco;

    @OneToMany(mappedBy = "agendamento_id", fetch = FetchType.LAZY)
    private List<AgendamentoEntity> agendamentos;

    @OneToMany(mappedBy = "telefone_id", fetch = FetchType.LAZY)
    private List<TelefoneEntity> telefones;

}
