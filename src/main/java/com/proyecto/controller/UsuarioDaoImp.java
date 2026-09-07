package com.proyecto.controller;

import com.proyecto.dao.UsuarioDao;
import com.proyecto.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository   //Para trabajar con la base de datos
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    //Para la persistencia entre la base de datos y el objeto en Java
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Usuario> obtenerUsuarios() {

        String query="from Usuario";        //Similar a SQL pero es hibernate

//        List<Usuario> resultado=entityManager.createQuery(query).getResultList();
//        return resultado;

        return entityManager.createQuery(query).getResultList();
    }
}
