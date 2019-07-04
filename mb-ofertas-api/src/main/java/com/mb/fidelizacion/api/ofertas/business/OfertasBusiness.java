package com.mb.fidelizacion.api.ofertas.business;

import java.util.List;

import com.mb.fidelizacion.api.ofertas.domain.Oferta;

public interface OfertasBusiness {
	public List<Oferta> consultarTodas();
}
