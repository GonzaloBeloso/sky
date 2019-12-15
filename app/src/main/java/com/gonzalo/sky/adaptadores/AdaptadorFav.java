package com.gonzalo.sky.adaptadores;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gonzalo.sky.R;
import com.gonzalo.sky.utils.Fav;

import java.util.List;

public class AdaptadorFav extends RecyclerView.Adapter<AdaptadorFav.HolderAdapterPropio> {
    Context contexto;
    List<Fav> listaFav;

    public AdaptadorFav(Context contexto, List listaFav) {
        this.contexto = contexto;
        this.listaFav = listaFav;
    }

    @NonNull
    @Override
    public AdaptadorFav.HolderAdapterPropio onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(contexto).inflate(R.layout.recycler_fav,parent,false);
        return new HolderAdapterPropio(view);
    }


    @Override
    public void onBindViewHolder(@NonNull AdaptadorFav.HolderAdapterPropio holder, int position) {
        final Fav actual = (listaFav.get(position));
        holder.getNombre().setText(actual.getNombre());
        holder.getFotofav().setImageResource(actual.getFotoFav());
        if (!actual.isEstrellaFav())
            holder.getEstrella().setVisibility(View.INVISIBLE);

    }
    @Override
    public int getItemCount() {
        return listaFav.size();
    }

    class HolderAdapterPropio extends RecyclerView.ViewHolder{
        private ImageView estrella;
        private TextView nombre;
        private ImageView fotofav;


        public HolderAdapterPropio(@NonNull View itemView) {
            super(itemView);
            estrella = itemView.findViewById(R.id.estrella_fav);
            nombre = itemView.findViewById(R.id.nombre_fav);
            fotofav = itemView.findViewById(R.id.fotoFav);

        }
        public Layout getLayout(){
            return getLayout();
        }

        public ImageView getFotofav() {
            return fotofav;
        }

        public void setFotofav(ImageView fotofav) {
            this.fotofav = fotofav;
        }

        public void setEstrella_(ImageView estrella) {
            this.estrella = estrella;
        }

        public void setNombre(TextView nombre) {
            this.nombre = nombre;
        }


        public ImageView getEstrella() {
            return estrella;
        }

        public TextView getNombre() {
            return nombre;
        }

    }

}