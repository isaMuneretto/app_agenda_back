package com.app_agenda_back.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data //@Getter @Setter @Hash
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categoria")
public class CategoriaEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoriaId;

    private String categoriaNome;

    private String categoriaDescricao;

    @OneToMany(mappedBy = "servico_categoriaId", fetch = FetchType.LAZY)
    private List<ServicoEntity> servicos = new ArrayList<>();

}
