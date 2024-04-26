package com.app_agenda_back.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

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
    @OneToOne
    @JoinColumn(name = "usuario_endereco_id")
    private EnderecoEntity endereco;

    public UsuarioEntity() {

    }

    public UsuarioEntity(Long usuario_id, String usuario_nome, String usuario_cpf, String usuario_email, String usuario_senha, Date usuario_dataNascimento, EnderecoEntity endereco) {
        this.usuario_id = usuario_id;
        this.usuario_nome = usuario_nome;
        this.usuario_cpf = usuario_cpf;
        this.usuario_email = usuario_email;
        this.usuario_senha = usuario_senha;
        this.usuario_dataNascimento = usuario_dataNascimento;
        this.endereco = endereco;
    }

    public Long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUsuario_nome() {
        return usuario_nome;
    }

    public void setUsuario_nome(String usuario_nome) {
        this.usuario_nome = usuario_nome;
    }

    public String getUsuario_cpf() {
        return usuario_cpf;
    }

    public void setUsuario_cpf(String usuario_cpf) {
        this.usuario_cpf = usuario_cpf;
    }

    public String getUsuario_email() {
        return usuario_email;
    }

    public void setUsuario_email(String usuario_email) {
        this.usuario_email = usuario_email;
    }

    public String getUsuario_senha() {
        return usuario_senha;
    }

    public void setUsuario_senha(String usuario_senha) {
        this.usuario_senha = usuario_senha;
    }

    public Date getUsuario_dataNascimento() {
        return usuario_dataNascimento;
    }

    public void setUsuario_dataNascimento(Date usuario_dataNascimento) {
        this.usuario_dataNascimento = usuario_dataNascimento;
    }

    public EnderecoEntity getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoEntity endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEntity that = (UsuarioEntity) o;
        return Objects.equals(usuario_id, that.usuario_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario_id);
    }
}
