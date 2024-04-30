package com.app_agenda_back.Service;

import com.app_agenda_back.Model.AgendamentoEntity;
import com.app_agenda_back.Repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AgendamentoService {
    @Autowired
    AgendamentoRepository agendamentoRepository;

    public List<AgendamentoEntity> getAllAgendamentos(){
        return agendamentoRepository.findAll();
    }


}
