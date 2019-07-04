package com.mb.fidelizacion.api.puntos.repository;

import com.mb.fidelizacion.api.puntos.domain.Operador;
import com.mb.fidelizacion.api.puntos.domain.Usuario;

public interface OperadorDAO {

    Operador obtenerOperador(Operador operador);

    Operador obtenerOperadorUsuario(Usuario user);

    Operador crearOperador(Operador operador);
}
