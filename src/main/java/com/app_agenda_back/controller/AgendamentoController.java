package com.app_agenda_back.controller;

import com.app_agenda_back.dto.AgendamentoDTO;
import com.app_agenda_back.dto.CategoriaDTO;
import com.app_agenda_back.model.AgendamentoEntity;
import com.app_agenda_back.model.CategoriaEntity;
import com.app_agenda_back.service.AgendamentoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//protocolo http p/ comunicação
@RequestMapping("/agenda")
public class AgendamentoController {
//    @Autowired
//    private AgendamentoService agendamentoService;
//
//    @GetMapping//(value = "/all")
//    public ResponseEntity<List<AgendamentoDTO>> getAllAgendamento(){
//        List<AgendamentoDTO> agendamentosDTO = agendamentoService.findAll();
//        return ResponseEntity.ok(agendamentosDTO);
//    }
//    @GetMapping("/{id}") //busca por id
//    public ResponseEntity<AgendamentoDTO> getAgendamentoById(@PathVariable Long id){
//        AgendamentoDTO agendamentoDTO = agendamentoService.findById(id);
//        return ResponseEntity.ok(agendamentoDTO);
//    }
//
//    @PostMapping
//    public ResponseEntity<AgendamentoDTO> createAgendamento(@Valid @RequestBody AgendamentoDTO agendamentoDTO){
//        AgendamentoDTO createAgendamentoDTO = AgendamentoService.create(agendamentoDTO);
//        return ResponseEntity.status(HttpStatus.CREATED).body(createAgendamentoDTO);
//    }




//    public List<AgendamentoEntity> getAllAgendamento(){
//        return agendamentoService.getAllAgendamentos();
//    }
//
//
////    @PostMapping(value = "/createAgenda", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
////    public AgendamentoEntity createNewAgendamento(@RequestBody AgendamentoEntity agendamento){
////        return agendamentoService.createNewAgendamento(agendamento);
////    }
}
