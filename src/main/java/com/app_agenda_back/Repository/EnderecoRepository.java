package com.app_agenda_back.Repository;

import com.app_agenda_back.Model.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository <EnderecoEntity,Long> {
}
