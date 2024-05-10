package com.app_agenda_back.mapper;

import com.app_agenda_back.dto.EnderecoDTO;
import com.app_agenda_back.model.EnderecoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EnderecoMapper {
    @Mapping(source = "enderecoId", target = "enderecoId")
    EnderecoDTO toDTO(EnderecoEntity endereco);

    @Mapping(source = "enderecoDTO.enderecoId", target = "enderecoId")
    EnderecoEntity toEntity(EnderecoDTO enderecoDTO);

    List<EnderecoDTO> toDTO(List<EnderecoEntity> enderecos);

    @Mappings({
            @Mapping(source = "enderecoDTO.enderecoId", target = "enderecoId"),
            @Mapping(source = "enderecoDTO.enderecoRua", target = "enderecoRua"),
            @Mapping(source = "enderecoDTO.enderecoCep", target = "enderecoCep"),
            @Mapping(source = "enderecoDTO.enderecoNumero", target = "enderecoNumero"),
            @Mapping(source = "enderecoDTO.enderecoComplemento", target = "enderecoComplemento"),
            @Mapping(source = "enderecoDTO.enderecoCidade", target = "enderecoCidade"),
            @Mapping(source = "enderecoDTO.enderecoEstado", target = "enderecoEstado"),
            @Mapping(source = "enderecoDTO.enderecoBairro", target = "enderecoBairro"),
            @Mapping(source = "enderecoDTO.usuarios", target = "usuarios"),
            @Mapping(source = "enderecoDTO.prestadores", target = "prestadores")
    })
    EnderecoEntity updateEntity(EnderecoDTO enderecoDTO, EnderecoEntity endereco);
}




//CONVERSÃO MANUAL DTO P/ ENTITY E VICE-VERSA
//public EnderecoDTO convertToDTO(EnderecoEntity endereco){
//    EnderecoDTO enderecoDTO = new EnderecoDTO();
//    enderecoDTO.setEnderecoId(endereco.getEnderecoId());
//    enderecoDTO.setEnderecoRua(endereco.getEnderecoRua());
//    enderecoDTO.setEnderecoCep(endereco.getEnderecoCep());
//    enderecoDTO.setEnderecoNumero(endereco.getEnderecoNumero());
//    enderecoDTO.setEnderecoComplemento(endereco.getEnderecoComplemento());
//    enderecoDTO.setEnderecoCidade(endereco.getEnderecoCidade());
//    enderecoDTO.setEnderecoEstado(endereco.getEnderecoEstado());
//    enderecoDTO.setEnderecoBairro(endereco.getEnderecoBairro());
//    return enderecoDTO;
//}

//public EnderecoEntity convertToEntity(EnderecoDTO enderecoDTO){
//    EnderecoEntity endereco = new EnderecoDTO();
//    EnderecoEntity.setEnderecoId(enderecoDTO.getEnderecoId());
//    EnderecoEntity.setEnderecoRua(enderecoDTO.getEnderecoRua());
//    EnderecoEntity.setEnderecoCep(enderecoDTO.getEnderecoCep());
//    EnderecoEntity.setEnderecoNumero(enderecoDTO.getEnderecoNumero());
//    EnderecoEntity.setEnderecoComplemento(enderecoDTO.getEnderecoComplemento());
//    EnderecoEntity.setEnderecoCidade(enderecoDTO.getEnderecoCidade());
//    EnderecoEntity.setEnderecoEstado(enderecoDTO.getEnderecoEstado());
//    EnderecoEntity.setEnderecoBairro(enderecoDTO.getEnderecoBairro());
//    return endereco;