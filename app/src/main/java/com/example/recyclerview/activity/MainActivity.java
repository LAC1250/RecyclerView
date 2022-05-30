package com.example.recyclerview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.Adapter;
import com.example.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcV;
    private List <Filme> listaFilmes = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcV = findViewById(R.id.rcV);
        //chama a listagem de filmes
        this.criarFilmes();
        //configurando adaper
        Adapter adapter = new Adapter(listaFilmes);

        //configurando recyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rcV.setLayoutManager(layoutManager);
        rcV.setHasFixedSize(true);
        rcV.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        rcV.setAdapter(adapter);
    }
    public void criarFilmes(){
        Filme filme = new Filme("titulo","genero","ano");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo1","genero1","ano1");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo2","genero2","ano2");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo3","genero3","ano3");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo3","genero3","ano3");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo3","genero3","ano3");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo3","genero3","ano3");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo3","genero3","ano3");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo3","genero3","ano3");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo3","genero3","ano3");
        this.listaFilmes.add(filme);
        filme = new Filme("titulo3","genero3","ano3");
        this.listaFilmes.add(filme);
    }
}