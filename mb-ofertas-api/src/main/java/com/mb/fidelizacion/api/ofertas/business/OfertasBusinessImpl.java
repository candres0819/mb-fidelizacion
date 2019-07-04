package com.mb.fidelizacion.api.ofertas.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.fidelizacion.api.ofertas.domain.Oferta;
import com.mb.fidelizacion.api.ofertas.repository.OfertasDAO;

@Service
public class OfertasBusinessImpl implements OfertasBusiness {

    // private static Oferta[] ofertas = {new Oferta("Bahamas 2x1", new Date()),new Oferta("República dominicana 2x1", new Date())};

    @Autowired
    private OfertasDAO ofertasDAO;

    public List<Oferta> consultarTodas() {
        List<Oferta> ofertas = ofertasDAO.obtenerTodasOfertas();
        return ofertas;
    }

}
