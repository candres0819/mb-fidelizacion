package com.mb.fidelizacion.api.puntos.repository;

import com.mb.fidelizacion.api.puntos.domain.Operador;
import com.mb.fidelizacion.api.puntos.domain.Usuario;


public interface OperadorDAO {
	public Operador obtenerOperador(Operador operador);
	public Operador obtenerOperadorUsuario(Usuario user);
	public Operador crearOperador(Operador operador);
}
