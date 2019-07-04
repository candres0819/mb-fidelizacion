package com.mb.fidelizacion.api.puntos.repository;

import com.mb.fidelizacion.api.puntos.domain.Usuario;


public interface UsuarioDAO {
	public Usuario obtenerUsuario(Usuario usuario);
	public Usuario obtenerUsuarioEmail(String email);
	public Usuario crearUsuario(Usuario usuario);
}
