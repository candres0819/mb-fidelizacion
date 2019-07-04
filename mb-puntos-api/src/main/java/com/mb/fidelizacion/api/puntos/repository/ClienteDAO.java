package com.mb.fidelizacion.api.puntos.repository;

import com.mb.fidelizacion.api.puntos.domain.Cliente;
import com.mb.fidelizacion.api.puntos.domain.Usuario;

public interface ClienteDAO {

    public Cliente obtenerCliente(Cliente cliente);

    public Cliente obtenerClienteEmail(String email);

    public Cliente obtenerClienteUsuario(Usuario user);

    public Cliente guardarCliente(Cliente cliente);
}
