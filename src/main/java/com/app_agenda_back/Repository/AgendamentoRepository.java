package com.app_agenda_back.Repository;

import com.app_agenda_back.Model.AgendamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<AgendamentoEntity,Long> {
}

