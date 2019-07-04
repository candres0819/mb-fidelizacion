package com.mb.fidelizacion.api.login.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.mb.fidelizacion.api.login.model.Cliente;
import com.mb.fidelizacion.api.login.model.Usuario;

@Service
public class ClienteDAOImpl implements ClienteDAO {

    final String COLLECTION_CLIENTE = "cliente";

    @Autowired
    private MongoTemplate mongoTemplate;

    public Cliente obtenerCliente(Cliente cliente) {
        Query query = new Query(Criteria.where("id_usuario").is(cliente.getId_usuario()));
        return this.mongoTemplate.findOne(query, Cliente.class, COLLECTION_CLIENTE);
    }

    public Cliente guardarCliente(Cliente cliente) {
        this.mongoTemplate.save(cliente);
        return cliente;
    }

    public Cliente obtenerClienteUsuario(Usuario user) {
        Query query = new Query(Criteria.where("id_usuario").is(user.getId()));
        return this.mongoTemplate.findOne(query, Cliente.class, COLLECTION_CLIENTE);
    }

}
