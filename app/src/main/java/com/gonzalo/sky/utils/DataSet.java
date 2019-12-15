package com.gonzalo.sky.utils;

import com.gonzalo.sky.R;

import java.util.ArrayList;

public class DataSet {
    public static DataSet newInstance(){

        DataSet dataSet = new DataSet();

        return dataSet;

    }

    public ArrayList listaMarcaZapatillas(){

        ArrayList<Marcas> lista = new ArrayList<>();

        lista.add(new Marcas("Nike","EEUU", R.drawable.airmag,null));
        lista.add(new Marcas("Adidas","EEUU", R.drawable.yeezy700,null));
        lista.add(new Marcas("Off-White","Italia", R.drawable.pincho_logo,null));
        return lista;
    }

    public ArrayList listaMarcaRopa(){
        ArrayList<Marcas> lista = new ArrayList<>();
        lista.add(new Marcas("Camisetas","De lujo", R.drawable.murakamif,null));
        lista.add(new Marcas("Sudaderas","Streetwear", R.drawable.sudadera,null));
        lista.add(new Marcas("Accesorios","Streetwear", R.drawable.buck,null));

        return lista;
    }

    public ArrayList listaMarcaColeccion(){
        ArrayList<Marcas> lista = new ArrayList<>();
        lista.add(new Marcas("Kaws","artist", R.drawable.kaws_logo,null));
        lista.add(new Marcas("Murakami","artist", R.drawable.logo_murakami,null));
        return lista;
    }

    public ArrayList listaOutfitSky(){
        ArrayList<Outfit> lista = new ArrayList<>();
        lista.add(new Outfit("Zapatillas",R.drawable.airmag,listaMarcaZapatillas()));
        lista.add(new Outfit("Ropa",R.drawable.murakamif,listaMarcaRopa()));
        lista.add(new Outfit("Coleccion",R.drawable.kaws_logo,listaMarcaColeccion()));
        return lista;
    }
    public ArrayList FavNike(){
        ArrayList<Fav> lista = new ArrayList<>();
        lista.add(new Fav("OW Air Max",false,R.drawable.airmax));
        lista.add(new Fav("Yeezy 700",true,R.drawable.yeezy700));
        lista.add(new Fav("Travis Scott",true,R.drawable.cactus));
        lista.add(new Fav("OW Vaporfly",false,R.drawable.pink));
        lista.add(new Fav("Uni blue",true,R.drawable.bluecool));
        return lista;
    }



}