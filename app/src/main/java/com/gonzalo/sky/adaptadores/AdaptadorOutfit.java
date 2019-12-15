package com.gonzalo.sky.adaptadores;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gonzalo.sky.MainActivity;
import com.gonzalo.sky.R;
import com.gonzalo.sky.utils.Fav;
import com.gonzalo.sky.utils.Outfit;

import java.util.ArrayList;

public class AdaptadorOutfit extends RecyclerView.Adapter<AdaptadorOutfit.HolderAdapterOutfit> {

    Context ctx;
    ArrayList<Outfit> listaOutfit;
    OnMiRecyclerListener listener;


    public AdaptadorOutfit(MainActivity fav, ArrayList<Outfit> listaFav) {
        this.ctx = fav;
        this.listaOutfit = listaFav;
        listener = (OnMiRecyclerListener) ctx;
    }

    @NonNull
    @Override
    public HolderAdapterOutfit onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(ctx).inflate(R.layout.recycler_fav,
                parent, false);
        HolderAdapterOutfit miHolder = new HolderAdapterOutfit(view);
        return miHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderAdapterOutfit holder, int position) {

        final Outfit actual = listaOutfit.get(position);
        System.out.println(holder.getNombreOutfit());
        holder.getNombreOutfit().setText(actual.getNombreOutfit());
        holder.getImagenOutfit().setImageResource(actual.getLogoOutfit());

        holder.getNombreOutfit().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onMiRecycler(actual);
            }
        });

        holder.getImagenOutfit().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onMiRecycler(actual);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaOutfit.size();
    }

    class HolderAdapterOutfit extends RecyclerView.ViewHolder {
        private ImageView imagenOutfit;
        private TextView nombreOutfit;
        private LinearLayout layout_Outfit;

        public HolderAdapterOutfit(@NonNull View itemView) {
            super(itemView);

            nombreOutfit = itemView.findViewById(R.id.nombre_fav);
            imagenOutfit = itemView.findViewById(R.id.fotoFav);
            //layout_Outfit = itemView.findViewById(R.id.layout_recycler_Outfit);

        }

        public LinearLayout getLayout_Outfit() {
            return layout_Outfit;
        }

        public ImageView getImagenOutfit() {
            return imagenOutfit;
        }

        public TextView getNombreOutfit() {
            return nombreOutfit;
        }

    }

    public interface OnMiRecyclerListener {
        public void onMiRecycler(Outfit outfit);
    }
}