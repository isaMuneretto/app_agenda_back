package com.app_agenda_back.controller;

import com.app_agenda_back.model.AgendamentoEntity;
import com.app_agenda_back.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agenda")
public class AgendamentoController {
    @Autowired
    AgendamentoService agendamentoService;

    @GetMapping//(value = "/all")
    public List<AgendamentoEntity> getAllAgendamento(){
        return agendamentoService.getAllAgendamentos();
    }


//    @PostMapping(value = "/createAgenda", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public AgendamentoEntity createNewAgendamento(@RequestBody AgendamentoEntity agendamento){
//        return agendamentoService.createNewAgendamento(agendamento);
//    }
}