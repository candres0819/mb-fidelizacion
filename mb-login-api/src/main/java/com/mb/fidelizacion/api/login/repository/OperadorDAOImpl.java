package com.mb.fidelizacion.api.login.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.mb.fidelizacion.api.login.model.Operador;
import com.mb.fidelizacion.api.login.model.Usuario;

@Service
public class OperadorDAOImpl implements OperadorDAO {

	@Autowired
    MongoTemplate mongoTemplate;
 
    final String COLLECTION_OPERADOR = "operador";
    
	public Operador obtenerOperador(Operador operador) {
		Query query = new Query(Criteria.where("id_usuario").is(operador.getId()));
        return mongoTemplate.findOne(query, Operador.class, COLLECTION_OPERADOR);
	}

	public Operador obtenerOperadorUsuario(Usuario user) {
		Query query = new Query(Criteria.where("id_usuario").is(user.getId()));
        return mongoTemplate.findOne(query, Operador.class, COLLECTION_OPERADOR);
	}

	public Operador crearOperador(Operador operador) {
		mongoTemplate.save(operador);
		return operador;
	}

}
