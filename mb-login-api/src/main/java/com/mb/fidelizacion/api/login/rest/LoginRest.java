package com.mb.fidelizacion.api.login.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mb.fidelizacion.api.login.business.LoginBusiness;
import com.mb.fidelizacion.api.login.domain.ClienteBean;
import com.mb.fidelizacion.api.login.model.Usuario;

@RestController
public class LoginRest {

    @Autowired
    private LoginBusiness loginService;

    @RequestMapping(path = "/login", params = { "email",
            "password" }, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Usuario login(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password) {
        Usuario user = new Usuario("", password, email);
        return this.loginService.login(user);
    }

    @RequestMapping(path = "/registroCliente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ClienteBean registroCliente(@RequestBody ClienteBean cliente) {
        ClienteBean client = this.loginService.registrarCliente(cliente);
        return client;
    }
}