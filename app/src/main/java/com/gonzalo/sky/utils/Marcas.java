package com.gonzalo.sky.utils;


import java.io.Serializable;
import java.util.ArrayList;

public class Marcas implements Serializable {
    String nombreMarcas,pais;
    int brand;
    ArrayList outfitFav;


    public Marcas(String nombreMarcas,String pais, int brand,ArrayList outfitFav) {
        this.nombreMarcas = nombreMarcas;
        this.pais = pais;
        this.brand = brand;
        this.outfitFav = outfitFav;
    }

    public  ArrayList getOutfitFav() {
        return outfitFav;
    }

    public void setOutfitFav(ArrayList outfitFav) {
        this.outfitFav = outfitFav;
    }

    public String getNombreMarcas() {
        return nombreMarcas;
    }

    public void setNombreMarcas(String nombreMarcas) {
        this.nombreMarcas = nombreMarcas;
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }
}