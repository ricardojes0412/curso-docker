package com.security.model.dao;

import com.security.model.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {

    Usuario findByUsername(@Param("nombre") String Username);
}
