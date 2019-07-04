package com.mb.fidelizacion.api.login.business;

import com.mb.fidelizacion.api.login.domain.ClienteBean;
import com.mb.fidelizacion.api.login.model.Operador;
import com.mb.fidelizacion.api.login.model.Usuario;

public interface LoginBusiness {

    Usuario login(Usuario usuario);

    ClienteBean registrarCliente(ClienteBean cliente);

    Operador registrarOperador(Operador operador);
}