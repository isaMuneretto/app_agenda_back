package com.app_agenda_back.controller;

import com.app_agenda_back.dto.CategoriaDTO;
import com.app_agenda_back.dto.EnderecoDTO;
import com.app_agenda_back.dto.UsuarioDTO;
import com.app_agenda_back.service.AgendamentoService;
import com.app_agenda_back.service.EnderecoService;
import com.app_agenda_back.service.TelefoneService;
import com.app_agenda_back.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> getAllUsuarios(){
        List<UsuarioDTO> usuariosDTO = usuarioService.findAll();
        return ResponseEntity.ok(usuariosDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> getUsuarioById(@PathVariable Long id) {
        UsuarioDTO usuarioDTO = usuarioService.findById(id);
        return ResponseEntity.ok(usuarioDTO);
    }

    @PutMapping("{id}")
    public ResponseEntity<UsuarioDTO> updateUsuario(@PathVariable Long id, @Valid @RequestBody UsuarioDTO usuarioDTO){
        UsuarioDTO updateUsuarioDTO = usuarioService.update(id,usuarioDTO);
        return ResponseEntity.ok(updateUsuarioDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id){
        usuarioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
