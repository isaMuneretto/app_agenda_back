package com.app_agenda_back.Model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
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

    @OneToMany(mappedBy = "servico_id", fetch = FetchType.LAZY)
    private List<ServicoEntity> servicos;

}
