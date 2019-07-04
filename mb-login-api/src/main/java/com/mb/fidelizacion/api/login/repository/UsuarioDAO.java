package com.mb.fidelizacion.api.login.repository;

import com.mb.fidelizacion.api.login.model.Usuario;


public interface UsuarioDAO {
	public Usuario obtenerUsuario(Usuario usuario);
	public Usuario obtenerUsuarioEmail(String email);
	public Usuario crearUsuario(Usuario usuario);
	public void eliminarUsuario(Usuario usuario);
}
