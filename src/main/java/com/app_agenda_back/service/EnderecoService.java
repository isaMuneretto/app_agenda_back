package com.app_agenda_back.service;

import com.app_agenda_back.dto.EnderecoDTO;
import com.app_agenda_back.mapper.EnderecoMapper;
import com.app_agenda_back.model.EnderecoEntity;
import com.app_agenda_back.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private EnderecoMapper enderecoMapper;

    //buscar todos os endereços
    public List<EnderecoDTO> findAll(){
        List<EnderecoEntity> enderecos = enderecoRepository.findAll();
        return enderecos.stream().map(enderecoMapper::toDTO).collect(Collectors.toList());
    }

    //buscar um endereço pelo id
    public EnderecoDTO findById(Long id){
        EnderecoEntity endereco = enderecoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Endereço não encontrado"));
        return enderecoMapper.toDTO(endereco);
    }

    //cria um endereço
    public EnderecoDTO create(EnderecoDTO enderecoDTO){
        EnderecoEntity endereco = enderecoMapper.toEntity(enderecoDTO);
        endereco = enderecoRepository.save(endereco);

        return enderecoMapper.toDTO(endereco);
    }

    //atualiza um endereco
    public EnderecoDTO update(Long id,EnderecoDTO enderecoDTO){
        EnderecoEntity endereco = enderecoRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Endereço atualizado"));
        enderecoMapper.updateEntity(enderecoDTO,endereco);
        endereco = enderecoRepository.save(endereco);
        return enderecoMapper.toDTO(endereco);
    }

    //deletar endereço
    public void deleteById(Long id) {
        enderecoRepository.deleteById(id);
    }
}
