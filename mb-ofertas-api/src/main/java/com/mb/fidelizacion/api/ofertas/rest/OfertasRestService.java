package com.mb.fidelizacion.api.ofertas.rest;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mb.fidelizacion.api.ofertas.business.OfertasBusiness;
import com.mb.fidelizacion.api.ofertas.domain.Oferta;

@RestController
public class OfertasRestService {

    @Autowired
    private OfertasBusiness ofertasService;

    @RequestMapping(path = "/oferta", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Oferta> listarOfertas(Model model, HttpSession sesion) {
        return ofertasService.consultarTodas();
    }
}
