package com.proyecto.controller;

import com.proyecto.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value="prueba")
    public String prueba(){
        return "prueba";
    }

    @RequestMapping(value="persona")
    public List<String> listarPersonas(){
        return List.of("Diego", "Juan", "Pedro");
    }

    @RequestMapping(value="usuarios")
    public Usuario listarUsuarios(){
        Usuario usuario = new Usuario();

        usuario.setNombre("Diego");
        usuario.setApellido("Vargas");
        usuario.setEmail("dvargasgodoy@gmail.com");
        usuario.setTelefono("155619965");

        return usuario;
    }

    @RequestMapping(value="usuario/{id}")       //{} para pasar variables por medio de la ruta
    public Usuario getUsuario(@PathVariable Long id){       // PathVariable recibe un valor desde la url
        Usuario usuario = new Usuario();

        usuario.setId(id);
        usuario.setNombre("Diego");
        usuario.setApellido("Vargas");
        usuario.setEmail("dvargasgodoy@gmail.com");
        usuario.setTelefono("155619965");

        return usuario;
    }


}
