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
@Table(name = "usuario")
public class TelefoneEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "telefone_id")
    private Long telefone_id;

    @Column(name = "telefone_numero")
    private String telefone_numero;

    @ManyToOne
    @JoinColumn(name = "telefone_usuario_id")
    private UsuarioEntity usuario;

    @ManyToOne
    @JoinColumn(name = "telefone_prestador_id")
    private PrestadorEntity prestador;
}
