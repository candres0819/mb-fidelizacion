package com.mb.fidelizacion.api.login.repository;

import com.mb.fidelizacion.api.login.model.Cliente;
import com.mb.fidelizacion.api.login.model.Usuario;

public interface ClienteDAO {

    public Cliente obtenerCliente(Cliente cliente);

    public Cliente obtenerClienteUsuario(Usuario user);

    public Cliente guardarCliente(Cliente cliente);
}
