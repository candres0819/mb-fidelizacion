package com.mb.fidelizacion.api.puntos.repository;

import com.mb.fidelizacion.api.puntos.domain.Cliente;
import com.mb.fidelizacion.api.puntos.domain.Usuario;

public interface ClienteDAO {

     Cliente obtenerCliente(Cliente cliente);

     Cliente obtenerClienteEmail(String email);

     Cliente obtenerClienteUsuario(Usuario user);

     Cliente guardarCliente(Cliente cliente);
}
