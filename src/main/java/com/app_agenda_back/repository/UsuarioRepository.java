package com.app_agenda_back.repository;


import com.app_agenda_back.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long> {
//    UsuarioEntity findByCpf(String usuarioCpf);
//    UsuarioEntity findByEmail(String usuarioEmail);
}
