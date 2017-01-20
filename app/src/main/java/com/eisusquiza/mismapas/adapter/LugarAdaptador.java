package com.eisusquiza.mismapas.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.eisusquiza.mismapas.MapsActivity;
import com.eisusquiza.mismapas.R;
import com.eisusquiza.mismapas.pojo.Lugares;

import java.util.ArrayList;

import static android.R.attr.onClick;

/**
 * Created by eisusquiza on 19/01/2017.
 */

public class LugarAdaptador extends RecyclerView.Adapter<LugarAdaptador.LugarViewHolder>{

    ArrayList<Lugares> lugares;
    Activity activity;

    public LugarAdaptador(ArrayList<Lugares> lugares, Activity activity){

        this.lugares=lugares;
        this.activity=activity;
    }


    @Override
    public LugarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_lugares, parent, false);
        return new LugarViewHolder(v);
    }

    @Override
    public void onBindViewHolder(LugarViewHolder holder, int position) {
        final Lugares lugar=lugares.get(position);
        holder.imgLugares.setImageResource(lugar.getLugar());
        holder.tvnombre_lugar.setText(lugar.getNombre_lugar());
        holder.tvCiudad.setText(lugar.getCiudad_lugar());

        holder.imgLugares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, lugar.getNombre_lugar(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, MapsActivity.class);
                intent.putExtra("latitud", lugar.getLatitud());
                intent.putExtra("longitud", lugar.getLongitud());
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return lugares.size();
    }

    public static class LugarViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgLugares;
        private TextView tvnombre_lugar;
        private TextView tvCiudad;


        public LugarViewHolder(View itemView) {
            super(itemView);
            imgLugares = (ImageView) itemView.findViewById(R.id.imgLugares);
            tvnombre_lugar = (TextView) itemView.findViewById(R.id.tvnombre_lugar);
            tvCiudad = (TextView) itemView.findViewById(R.id.tvCiudad);

        }
    }
}
