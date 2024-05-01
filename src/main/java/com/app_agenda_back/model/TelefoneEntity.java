package com.app_agenda_back.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "telefone")
public class TelefoneEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long telefoneId;

    @Column(nullable = false,length = 45)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "(XX) XXXX-XXXX")
    private String telefoneNumero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "telefone_usuarioId",nullable = false)
    private UsuarioEntity usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "telefone_prestadorId",nullable = false)
    private PrestadorEntity prestador;
}
