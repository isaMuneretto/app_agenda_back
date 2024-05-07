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
@Table(name = "endereco")
public class EnderecoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enderecoId;

    private String enderecoRua;

    private String enderecoCep;

    private int enderecoNumero;

    private String enderecoComplemento;

    private String enderecoCidade;

    private String enderecoEstado;

    private String enderecoBairro;

    @OneToMany(mappedBy = "usuarioId", fetch = FetchType.LAZY)
    private List<UsuarioEntity> usuarios = new ArrayList<>();

    @OneToMany(mappedBy = "prestadorId", fetch = FetchType.LAZY)
    private List<PrestadorEntity> prestadores = new ArrayList<>();
}
