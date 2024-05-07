package com.app_agenda_back.mapper;
import com.app_agenda_back.dto.CategoriaDTO;
import com.app_agenda_back.model.CategoriaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {
    @Mapping(source = "categoriaId", target = "categoriaId") //entidade para DTO
    CategoriaDTO toDTO(CategoriaEntity categoria);

    @Mapping(source = "categoriaDTO.categoriaId", target = "categoriaId")
    CategoriaEntity toEntity(CategoriaDTO categoriaDTO);

    List<CategoriaDTO> toDTO(List<CategoriaEntity> categorias); //transformar a lista de categorias que vem do banco em DTO

    @Mappings({
            @Mapping(source = "categoriaDTO.categoriaId", target = "categoriaId"),
            @Mapping(source = "categoriaDTO.categoriaNome", target = "categoriaNome"),
            @Mapping(source = "categoriaDTO.categoriaDescricao", target = "categoriaDescricao"),
    })
    CategoriaEntity updateEntity(CategoriaDTO categoriaDTO, CategoriaEntity categoria); //recebe DTO no front e envia como Entity os valores dos campos

}
