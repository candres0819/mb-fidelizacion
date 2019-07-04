package com.mb.fidelizacion.api.login.repository;

import com.mb.fidelizacion.api.login.model.Operador;
import com.mb.fidelizacion.api.login.model.Usuario;


public interface OperadorDAO {
	public Operador obtenerOperador(Operador operador);
	public Operador obtenerOperadorUsuario(Usuario user);
	public Operador crearOperador(Operador operador);
}
