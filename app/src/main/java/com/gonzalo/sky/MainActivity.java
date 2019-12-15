package com.gonzalo.sky;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.gonzalo.sky.adaptadores.AdaptadorMarca;
import com.gonzalo.sky.adaptadores.AdaptadorFav;
import com.gonzalo.sky.adaptadores.AdaptadorOutfit;
import com.gonzalo.sky.utils.DataSet;
import com.gonzalo.sky.utils.Marcas;
import com.gonzalo.sky.utils.Fav;
import com.gonzalo.sky.utils.Outfit;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdaptadorOutfit.OnMiRecyclerListener,
        AdaptadorMarca.OnMiRecyclerListener,AdapterView.OnItemClickListener {

    RecyclerView recyclerMarcas;
    RecyclerView recyclerOutfit;
    AdaptadorOutfit adaptadorOutfit;
    AdaptadorMarca adaptadorMarca;
    AdaptadorFav adaptadorJugadores;
    ArrayList<Marcas> listaMarcas;
    ArrayList<Marcas> listaRopa;
    ArrayList<Marcas> listaZapatillas;
    ArrayList<Outfit> listaOutfit;
    Context context;
    final static String TAG_1="Objeto";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        rellenarRecyclerOutfit();
        rellenarRecyclerMarcas();

        acciones();

    }

    private void acciones() {
    }

    private void rellenarRecyclerMarcas() {
        recyclerMarcas.setAdapter(adaptadorMarca);
        adaptadorMarca.notifyDataSetChanged();
        recyclerMarcas.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    }

    private void rellenarRecyclerOutfit() {
        recyclerOutfit.setAdapter(adaptadorOutfit);
        adaptadorOutfit.notifyDataSetChanged();
        recyclerOutfit.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        adaptadorOutfit.notifyDataSetChanged();
    }


    private void instancias() {
        recyclerMarcas = findViewById(R.id.layout_recycler_Marcas);
        recyclerOutfit = findViewById(R.id.layout_recycler_Outfit);
        listaOutfit = DataSet.newInstance().listaOutfitSky();

        listaMarcas = DataSet.newInstance().listaMarcaZapatillas();

        adaptadorMarca = new AdaptadorMarca(MainActivity.this,listaMarcas);
        adaptadorOutfit = new AdaptadorOutfit(MainActivity.this,listaOutfit);



    }



    @Override
    public void onMiRecycler(Outfit outfit) {
        adaptadorMarca = new AdaptadorMarca(MainActivity.this, outfit.getOutfitMarcas());
        recyclerMarcas.setAdapter(adaptadorMarca);
        adaptadorMarca.notifyDataSetChanged();

    }

    @Override
    public void onMiRecycler(Marcas marcas) {
        Intent i = new Intent(getApplicationContext(),FavoritoActivity.class);
        i.putExtra(TAG_1,marcas);
        startActivity(i);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}