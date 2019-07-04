package com.mb.fidelizacion.api.login.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.fidelizacion.api.login.domain.ClienteBean;
import com.mb.fidelizacion.api.login.domain.UsuarioBean;
import com.mb.fidelizacion.api.login.model.Cliente;
import com.mb.fidelizacion.api.login.model.Operador;
import com.mb.fidelizacion.api.login.model.Usuario;
import com.mb.fidelizacion.api.login.repository.ClienteDAO;
import com.mb.fidelizacion.api.login.repository.UsuarioDAO;

@Service
public class LoginBusinessImpl implements LoginBusiness {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Autowired
    private ClienteDAO clienteDAO;

    public Usuario login(Usuario usuario) {
        Usuario user = usuarioDAO.obtenerUsuario(usuario);
        return user;
    }

    private UsuarioBean register(UsuarioBean usuario) {
        if (null != usuario) {
            usuario.setTipo("cliente");
            Usuario user = this.usuarioDAO
                    .crearUsuario(new Usuario(usuario.getUsuario(), usuario.getPassword(), usuario.getPassword(), usuario.getTipo()));
            if (user != null) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public ClienteBean registrarCliente(ClienteBean cliente) {
        UsuarioBean user = this.register(cliente.getDatosUsuario());
        if (null != user) {
            // se ha guardado usuario
            Cliente cli = new Cliente();
            cli.setId_usuario(cliente.getDatosUsuario().getEmail());
            cli.setPuntos("0");
            cli = clienteDAO.guardarCliente(cli);
            if (cli != null) {// se ha guardado cliente
                return cliente;
            } else {// hacemos rollback
                usuarioDAO.eliminarUsuario(new Usuario(user.getId()));
            }
        }
        return null;
    }

    @Override
    public Operador registrarOperador(Operador operador) {
        // TODO Auto-generated method stub
        return null;
    }
}
