package com.app_agenda_back.Model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Data //@Getter @Setter @Hash
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categoria")
public class CategoriaEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id")
    private Long categoria_id;

    @Column(name = "categoria_nome")
    private String categoria_nome;

    @Column(name = "categoria_descricao")
    private String categoria_descricao;

    public CategoriaEntity() {

    }

    public CategoriaEntity(Long categoria_id, String categoria_nome, String categoria_descricao) {
        this.categoria_id = categoria_id;
        this.categoria_nome = categoria_nome;
        this.categoria_descricao = categoria_descricao;
    }

}
