package com.app_agenda_back.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "endereco")
public class EnderecoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endereco_id")
    private Long endereco_id;

    @Column(name = "endereco_rua")
    private String endereco_rua;

    @Column(name = "endereco_cep")
    private String endereco_cep;

    @Column(name = "endereco_numero")
    private String endereco_numero;

    @Column(name = "endereco_complemento")
    private String endereco_complemento;

    @Column(name = "endereco_cidade")
    private String endereco_cidade;

    @Column(name = "endereco_estado")
    private String endereco_estado;

    @Column(name = "endereco_bairro")
    private String endereco_bairro;

    public EnderecoEntity() {

    }

    public EnderecoEntity(Long endereco_id, String endereco_rua, String endereco_cep, String endereco_numero, String endereco_complemento, String endereco_cidade, String endereco_estado, String endereco_bairro) {
        this.endereco_id = endereco_id;
        this.endereco_rua = endereco_rua;
        this.endereco_cep = endereco_cep;
        this.endereco_numero = endereco_numero;
        this.endereco_complemento = endereco_complemento;
        this.endereco_cidade = endereco_cidade;
        this.endereco_estado = endereco_estado;
        this.endereco_bairro = endereco_bairro;
    }

}
