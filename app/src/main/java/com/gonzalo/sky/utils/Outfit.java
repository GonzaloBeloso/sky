package com.gonzalo.sky.utils;


import java.util.ArrayList;

public class Outfit {
    String nombreOutfit;
    int logoOutfit;
    ArrayList outfitMarcas;

    public Outfit(String nombreOutfit, int logoOutfit,ArrayList ligasMarcas) {
        this.nombreOutfit = nombreOutfit;
        this.logoOutfit = logoOutfit;
        this.outfitMarcas = outfitMarcas;
    }

    public ArrayList getOutfitMarcas() {
        return outfitMarcas;
    }

    public void setOutfitMarcas(ArrayList outfitMarcas) {
        this.outfitMarcas = outfitMarcas;
    }

    public String getNombreOutfit() {
        return nombreOutfit;
    }

    public void setNombreOutfit(String nombreOutfit) {
        this.nombreOutfit = nombreOutfit;
    }

    public  int getLogoOutfit() { return logoOutfit;}

    public void setLogoOutfit(int logoOutfit) {
        this.logoOutfit = logoOutfit;
    }
}