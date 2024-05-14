package com.app_agenda_back.mapper;

import com.app_agenda_back.dto.UsuarioDTO;
import com.app_agenda_back.model.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    @Mapping(source = "usuarioId", target = "usuarioId")
    UsuarioDTO toDTO(UsuarioEntity usuario);

    @Mapping(source = "usuarioDTO.usuarioId", target = "usuarioId")
    UsuarioEntity toEntity(UsuarioDTO usuarioDTO);

    List<UsuarioDTO> toDTO(List<UsuarioEntity> usuarios);

    @Mappings({
            @Mapping(source = "usuarioDTO.usuarioId", target = "usuarioId"),
            @Mapping(source = "usuarioDTO.usuarioNome", target = "usuarioNome"),
            @Mapping(source = "usuarioDTO.usuarioCpf", target = "usuarioCpf"),
            @Mapping(source = "usuarioDTO.usuarioEmail", target = "usuarioEmail"),
            @Mapping(source = "usuarioDTO.usuarioDataNascimento", target = "usuarioDataNascimento"),
            @Mapping(source = "usuarioDTO.usuarioSenha", target = "usuarioSenha"),
            @Mapping(source = "usuarioDTO.endereco", target = "endereco"),
//            @Mapping(source = "usuarioDTO.telefones", target = "telefones"),
//            @Mapping(source = "usuarioDTO.agendamentos", target = "agendamentos"),
    })
    UsuarioEntity updateEntity(UsuarioDTO usuarioDTO, UsuarioEntity usuarioEntity);
}




//CONVERSÃO MANUAL DTO P/ ENTITY E VICE-VERSA
//public CategoriaDTO convertToDTO(CategoriaEntity categoriaEntity){
//    CategoriaDTO categoriaDTO = new CategoriaDTO();
//    categoriaDTO.setCategoriaId(categoriaEntity.getCategoriaId());
//    categoriaDTO.setCategoriaNome(categoriaEntity.getCategoriaNome());
//    categoriaDTO.setCategoriaDescricao(categoriaEntity.getCategoriaDescricao());
//    return categoriaDTO;
//}
//public CategoriaEntity convertToEntity(CategoriaDTO categoriaDTO){
//    CategoriaEntity categoriaEntity = new CategoriaDTO();
//    CategoriaEntity.setCategoriaId(categoriaDTO.getCategoriaId());
//    CategoriaEntity.setCategoriaNome(categoriaDTO.getCategoriaNome());
//    CategoriaEntity.setCategoriaDescricao(categoriaDTO.getCategoriaDescricao());
//    return categoriaEntity;
