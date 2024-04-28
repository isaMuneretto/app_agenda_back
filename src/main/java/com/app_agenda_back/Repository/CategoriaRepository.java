package com.app_agenda_back.Repository;

import com.app_agenda_back.Model.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity,Long> {
}
