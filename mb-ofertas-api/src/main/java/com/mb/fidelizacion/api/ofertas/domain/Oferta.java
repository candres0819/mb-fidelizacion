package com.mb.fidelizacion.api.ofertas.domain;

public class Oferta {

    private String id;
    private String descripcion;
    private String caducidad;
    private String puntos;

    public Oferta() {
        super();
    }

    public Oferta(String descripcion, String caducidad) {
        super();
        this.descripcion = descripcion;
        this.caducidad = caducidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }
}
