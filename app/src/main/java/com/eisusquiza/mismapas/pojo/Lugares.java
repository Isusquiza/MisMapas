package com.eisusquiza.mismapas.pojo;

import android.widget.ImageView;

/**
 * Created by eisusquiza on 19/01/2017.
 */

public class Lugares {

    private int lugar;
    private String nombre_lugar;
    private String ciudad_lugar;
    private double latitud;
    private double longitud;

    public Lugares(int lugar, String nombre_lugar, String ciudad_lugar, double latitud, double longitud){
        this.lugar=lugar;
        this.nombre_lugar=nombre_lugar;
        this.ciudad_lugar=ciudad_lugar;
        this.latitud=latitud;
        this.longitud=longitud;

    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    public String getNombre_lugar() {
        return nombre_lugar;
    }

    public void setNombre_lugar(String nombre_lugar) {
        this.nombre_lugar = nombre_lugar;
    }

    public String getCiudad_lugar() {
        return ciudad_lugar;
    }

    public void setCiudad_lugar(String ciudad_lugar) {
        this.ciudad_lugar = ciudad_lugar;
    }
}
