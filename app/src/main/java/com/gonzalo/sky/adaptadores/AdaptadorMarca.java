package com.gonzalo.sky.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gonzalo.sky.MainActivity;
import com.gonzalo.sky.R;
import com.gonzalo.sky.utils.Marcas;


import java.util.ArrayList;

public class AdaptadorMarca extends RecyclerView.Adapter<AdaptadorMarca.HolderAdapterMarcas> {

    Context ctx;
    ArrayList<Marcas> listaMarcas;
    OnMiRecyclerListener listener;

    public AdaptadorMarca(MainActivity marcas, ArrayList<Marcas> listaMarcas) {
        this.ctx = marcas;
        this.listaMarcas = listaMarcas;
        listener = (OnMiRecyclerListener) ctx;
    }
    @NonNull
    @Override
    public HolderAdapterMarcas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(ctx).inflate(R.layout.recycler_marcas,
                parent,false);
        HolderAdapterMarcas miHolder = new HolderAdapterMarcas(view);
        return miHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderAdapterMarcas holder, int position) {
        final Marcas actual = listaMarcas.get(position);

        holder.getNombreMarca().setText(actual.getNombreMarcas());
        holder.getImagenMarca().setImageResource(actual.getBrand() );
        holder.getNombreBrand().setText(actual.getBrand());
        holder.getNombreMarca().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onMiRecycler(actual);
            }
        });



    }

    @Override
    public int getItemCount() { return listaMarcas.size(); }

    class HolderAdapterMarcas extends RecyclerView.ViewHolder {
        private ImageView imagenMarca;
        private TextView nombreMarca,nombreBrand;
        private LinearLayout layout_Marcas;

        public HolderAdapterMarcas(@NonNull View itemView) {
            super(itemView);

            nombreMarca = itemView.findViewById(R.id.nombreMarca);
            nombreBrand = itemView.findViewById(R.id.nombre_Outfit);
            imagenMarca = itemView.findViewById(R.id.imagen_Outfit);
            layout_Marcas = itemView.findViewById(R.id.layout_recycler_Marcas);
        }

        public ImageView getImagenMarca() {
            return imagenMarca;
        }

        public TextView getNombreMarca() {
            return nombreMarca;
        }

        public TextView getNombreBrand() {
            return nombreBrand;
        }

        public LinearLayout getLayout_Marcas() {
            return layout_Marcas;
        }
    }
    public interface OnMiRecyclerListener {
        public void onMiRecycler(Marcas marcas);
    }
}