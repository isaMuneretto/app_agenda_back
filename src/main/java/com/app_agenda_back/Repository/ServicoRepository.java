package com.app_agenda_back.Repository;

import com.app_agenda_back.Model.ServicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<ServicoEntity,Long> {
}
