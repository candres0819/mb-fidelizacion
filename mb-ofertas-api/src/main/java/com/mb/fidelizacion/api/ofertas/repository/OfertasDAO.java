package com.mb.fidelizacion.api.ofertas.repository;

import java.util.Date;
import java.util.List;

import com.mb.fidelizacion.api.ofertas.domain.Oferta;

public interface OfertasDAO {

    List<Oferta> obtenerTodasOfertas();

    List<Oferta> obtenerOfertasMes(Date fecha);
}
