package com.app_agenda_back.repository;

import com.app_agenda_back.model.ServicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<ServicoEntity,Long> {
}
