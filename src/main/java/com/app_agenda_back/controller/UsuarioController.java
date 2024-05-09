package com.app_agenda_back.controller;

import com.app_agenda_back.dto.CategoriaDTO;
import com.app_agenda_back.dto.UsuarioDTO;
import com.app_agenda_back.service.AgendamentoService;
import com.app_agenda_back.service.EnderecoService;
import com.app_agenda_back.service.TelefoneService;
import com.app_agenda_back.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private TelefoneService telefoneService;

    @Autowired
    private AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<UsuarioDTO> salvar(@Valid @RequestBody UsuarioDTO usuarioDTO) { //recebe os dados do post sem id
        UsuarioDTO salvaUsuarioDTO = usuarioService.salvar(usuarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvaUsuarioDTO); //converte em Entity
    }
}
