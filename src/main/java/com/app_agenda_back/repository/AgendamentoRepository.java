package com.app_agenda_back.repository;

import com.app_agenda_back.model.AgendamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<AgendamentoEntity,Long> {
}

