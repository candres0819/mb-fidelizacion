package com.mb.fidelizacion.api.ofertas.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.fidelizacion.api.ofertas.domain.Oferta;
import com.mb.fidelizacion.api.ofertas.repository.OfertasDAO;
@Service
public class OfertasServiceImpl implements IOfertasService {
	
//	private static Oferta[] ofertas = {new Oferta("Bahamas 2x1", new Date()),new Oferta("República dominicana 2x1", new Date())};
	
	@Autowired
	OfertasDAO ofertasDao;
	
	public List<Oferta> consultarTodas() {
		
		List<Oferta> ofertas = ofertasDao.obtenerTodasOfertas();
		return ofertas;
	}

}
