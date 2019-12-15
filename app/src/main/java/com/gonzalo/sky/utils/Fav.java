package com.gonzalo.sky.utils;

public class Fav {

    String nombre;
    boolean estrellaFav;
    int fotoFav;

    public Fav( String nombre, boolean estrellaFav,int fotoFav) {
        this.nombre = nombre;
        this.estrellaFav = estrellaFav;
        this.fotoFav = fotoFav;
    }

    public int getFotoFav() {
        return fotoFav;
    }

    public void setFotoFav(int fotoFav) {
        this.fotoFav = fotoFav;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstrellaFav() {
        return estrellaFav;
    }

    public void setEstrellaFav(boolean estrellaFav) {
        this.estrellaFav = estrellaFav;
    }
}