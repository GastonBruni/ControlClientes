package com.mycompany.dao;

import com.mycompany.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDAO extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
