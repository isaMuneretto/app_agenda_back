package com.app_agenda_back.repository;

import com.app_agenda_back.model.PrestadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestadorRepository extends JpaRepository<PrestadorEntity,Long> {
}
