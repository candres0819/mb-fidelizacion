
package com.mb.fidelizacion.api.puntos.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.mb.fidelizacion.api.puntos.domain.Usuario;

@Service
public class UsuarioDAOImpl implements UsuarioDAO {

    @Autowired
    MongoTemplate mongoTemplate;

    final String COLLECTION_USUARIO = "usuario";

    public Usuario obtenerUsuario(Usuario usuario) {
        Query query = new Query(Criteria.where("email").is(usuario.getEmail()).and("password").is(usuario.getPassword()));
        return mongoTemplate.findOne(query, Usuario.class, COLLECTION_USUARIO);
    }

    public Usuario crearUsuario(Usuario usuario) {
        mongoTemplate.save(usuario);
        return usuario;
    }

    public Usuario obtenerUsuarioEmail(String email) {
        Query query = new Query(Criteria.where("email").is(email));
        return mongoTemplate.findOne(query, Usuario.class, COLLECTION_USUARIO);
    }
}