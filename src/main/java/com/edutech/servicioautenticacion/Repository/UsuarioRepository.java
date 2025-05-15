package com.edutech.servicioautenticacion.Repository;

import com.edutech.servicioautenticacion.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}