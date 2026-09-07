package com.proyecto.dao;

import java.util.List;

import com.proyecto.models.Usuario;
import jakarta.transaction.Transactional;

@Transactional
public interface UsuarioDao {

    List<Usuario> obtenerUsuarios();

}
