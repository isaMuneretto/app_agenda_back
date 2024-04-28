package com.app_agenda_back.Controller;

import com.app_agenda_back.Model.AgendamentoEntity;
import com.app_agenda_back.Repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agenda")
public class AgendamentoController {
    @Autowired
    AgendamentoRepository agendamentoRepository;
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AgendamentoEntity> getAllAgendamento(){
        return agendamentoRepository.findAll();
    }
    @PostMapping(value = "/createAgenda", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public AgendamentoEntity createNewAgendamento(@RequestBody AgendamentoEntity agendamento){
        AgendamentoEntity createAgendamento = new AgendamentoEntity();
        createAgendamento.setAgendamento_data_inicio(agendamento.getAgendamento_data_inicio());
        createAgendamento.setAgendamento_data_fim(agendamento.getAgendamento_data_fim());
        createAgendamento.setAgendamento_observacao(agendamento.getAgendamento_observacao());
        createAgendamento.setAgendamento_status(agendamento.getAgendamento_status());
        return agendamentoRepository.save(createAgendamento);
    }
}
