package com.app_agenda_back.service;

import com.app_agenda_back.model.AgendamentoEntity;
import com.app_agenda_back.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {
    @Autowired
    AgendamentoRepository agendamentoRepository;

    public List<AgendamentoEntity> getAllAgendamentos(){
        return agendamentoRepository.findAll();
    }


}
