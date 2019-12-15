package com.gonzalo.sky;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.gonzalo.sky.adaptadores.AdaptadorFav;
import com.gonzalo.sky.utils.DataSet;
import com.gonzalo.sky.utils.Fav;

import java.util.ArrayList;

public class FavoritoActivity extends AppCompatActivity {

    AdaptadorFav adaptadorFav;
    RecyclerView recyclerFav;
    ArrayList<Fav> listaFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorito);
        instancias();


    }


    private void instancias() {
        recyclerFav = findViewById(R.id.layout_recycler_Fav);
        listaFav = new ArrayList();
        listaFav = DataSet.newInstance().FavNike();

        adaptadorFav = new AdaptadorFav(this,listaFav);
        recyclerFav.setAdapter(adaptadorFav);
        adaptadorFav.notifyDataSetChanged();
        recyclerFav.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

    }



}
