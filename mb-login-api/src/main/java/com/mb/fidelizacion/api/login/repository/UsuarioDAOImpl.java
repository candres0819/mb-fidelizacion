
package com.mb.fidelizacion.api.login.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.mb.fidelizacion.api.login.model.Usuario;

@Service
public class UsuarioDAOImpl implements UsuarioDAO {

    private final String COLLECTION_USUARIO = "usuario";

    @Autowired
    private MongoTemplate mongoTemplate;

    public Usuario obtenerUsuario(Usuario usuario) {
        Query query = new Query(Criteria.where("email").is(usuario.getEmail()).and("password").is(usuario.getPassword()));
        return this.mongoTemplate.findOne(query, Usuario.class, COLLECTION_USUARIO);
    }

    public Usuario crearUsuario(Usuario usuario) {
        this.mongoTemplate.save(usuario);
        return usuario;
    }

    public Usuario obtenerUsuarioEmail(String email) {
        Query query = new Query(Criteria.where("email").is(email));
        return this.mongoTemplate.findOne(query, Usuario.class, COLLECTION_USUARIO);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        this.mongoTemplate.remove(usuario);
    }
}