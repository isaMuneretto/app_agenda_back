package com.app_agenda_back.service;

import com.app_agenda_back.dto.EnderecoDTO;
import com.app_agenda_back.dto.UsuarioDTO;
import com.app_agenda_back.mapper.UsuarioMapper;
import com.app_agenda_back.model.EnderecoEntity;
import com.app_agenda_back.model.UsuarioEntity;
import com.app_agenda_back.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private TelefoneService telefoneService;

    @Autowired
    private AgendamentoService agendamentoService;

    @Autowired
    private UsuarioMapper usuarioMapper;

    public UsuarioDTO salvar(UsuarioDTO usuarioDTO){
        UsuarioEntity usuario = usuarioMapper.toEntity(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return usuarioMapper.toDTO(usuario); //transforma em DTO e envia para o front-end
    }

    public List<UsuarioDTO> findAll(){
        List<UsuarioEntity> enderecos = usuarioRepository.findAll();
        return enderecos.stream().map(usuarioMapper::toDTO).collect(Collectors.toList());
    }

    //buscar um endereço pelo id
    public UsuarioDTO findById(Long id){
        UsuarioEntity usuario = usuarioRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Endereço não encontrado"));
        return usuarioMapper.toDTO(usuario);
    }

    public UsuarioDTO update(Long id,UsuarioDTO usuarioDTO){
        UsuarioEntity usuario = usuarioRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Endereço não encontrado"));
        usuarioDTO.setUsuarioId(usuario.getUsuarioId()); //setar o id para nao criar um novo
        usuario = usuarioMapper.updateEntity(usuarioDTO,usuario);
        usuario = usuarioRepository.save(usuario);
        return usuarioMapper.toDTO(usuario);
    }

    //deletar endereço
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}
