package com.mb.fidelizacion.api.ofertas.rest;

import java.util.List;

import com.mb.fidelizacion.api.ofertas.domain.Oferta;

public interface IOfertasService {
	public List<Oferta> consultarTodas();
}
