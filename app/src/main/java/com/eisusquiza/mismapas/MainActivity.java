package com.eisusquiza.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.eisusquiza.mismapas.adapter.LugarAdaptador;
import com.eisusquiza.mismapas.pojo.Lugares;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Lugares> lugares;
    private RecyclerView listaLugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaLugares=(RecyclerView) findViewById(R.id.rvLugares);

        //LinearLayoutManager llm = new LinearLayoutManager(this);
        //llm.setOrientation(LinearLayoutManager.VERTICAL);
        GridLayoutManager glm = new GridLayoutManager(this, 2);
        listaLugares.setLayoutManager(glm);

        inicializarListaLugares();
        inicializarAdaptador();


    }

    public void iraMapa (View v){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }


    public void inicializarAdaptador(){
        LugarAdaptador adaptador = new LugarAdaptador(lugares, this);
        //listaLugares.setAdapter(adaptador);
        listaLugares.setAdapter(adaptador);
    }


    public void inicializarListaLugares(){
        lugares = new ArrayList<Lugares>();
        lugares.add(new Lugares(R.drawable.leon_guanajuato,"Plaza Centro", "León", 21.121962045833428,-101.68230855197447));
        lugares.add(new Lugares(R.drawable.teatro_bicentenario,"Teatro Bicentenario","León", 21.11411554725191,-101.6605933877899));
        lugares.add(new Lugares(R.drawable.basilica_gto,"Basílica","Guanajuato",21.016512425438833,-101.25320237747803));
        lugares.add(new Lugares(R.drawable.allende,"Plaza Centro","San Miguel de Allende", 20.914935391089966,-100.7424708520996));
    }


}
