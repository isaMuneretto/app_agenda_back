package com.app_agenda_back.Repository;

import com.app_agenda_back.Model.PrestadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestadorRepository extends JpaRepository<PrestadorEntity,Long> {
}
