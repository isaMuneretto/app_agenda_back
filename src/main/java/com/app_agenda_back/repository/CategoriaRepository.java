package com.app_agenda_back.repository;

import com.app_agenda_back.model.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity,Long> {
}
