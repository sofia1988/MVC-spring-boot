package com.creacionesbrunila.biblioteca.repositorios;

import com.creacionesbrunila.biblioteca.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {

    @Query("SELECT u FROM  Usuario u WHERE u.email =:email")
    public Usuario buscarxEmail(@Param("email") String email);
}
