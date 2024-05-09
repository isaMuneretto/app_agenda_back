package com.app_agenda_back.service;

import com.app_agenda_back.dto.CategoriaDTO;
import com.app_agenda_back.dto.UsuarioDTO;
import com.app_agenda_back.mapper.UsuarioMapper;
import com.app_agenda_back.model.CategoriaEntity;
import com.app_agenda_back.model.UsuarioEntity;
import com.app_agenda_back.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
