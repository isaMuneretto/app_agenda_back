package com.app_agenda_back.repository;

import com.app_agenda_back.model.TelefoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<TelefoneEntity,Long> {
}
