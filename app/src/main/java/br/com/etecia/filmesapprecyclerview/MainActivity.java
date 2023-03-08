package br.com.etecia.filmesapprecyclerview;

import static androidx.recyclerview.widget.RecyclerView.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> lstFilmes;


    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstFilmes = new ArrayList<>();

        lstFilmes.add(new Filmes("Tudo em todo lugar", "Arrastada para aventura", "Comédia", R.drawable.tudoemtodolugar));
        lstFilmes.add(new Filmes("Coringa", "Exploração de Arthur", "Drama", R.drawable.coringa));
        lstFilmes.add(new Filmes("Triangulo da Tristeza", "Casal modelo de celebridades", "Comédia", R.drawable.triangulodatristeza));
        lstFilmes.add(new Filmes("Tudo em todo lugar", "Arrastada para aventura", "Comédia", R.drawable.tudoemtodolugar));
        lstFilmes.add(new Filmes("Coringa", "Exploração de Arthur", "Drama", R.drawable.coringa));
        lstFilmes.add(new Filmes("Triangulo da Tristeza", "Casal modelo de celebridades", "Comédia", R.drawable.triangulodatristeza));
        lstFilmes.add(new Filmes("Tudo em todo lugar", "Arrastada para aventura", "Comédia", R.drawable.tudoemtodolugar));
        lstFilmes.add(new Filmes("Coringa", "Exploração de Arthur", "Drama", R.drawable.coringa));
        lstFilmes.add(new Filmes("Triangulo da Tristeza", "Casal modelo de celebridades", "Comédia", R.drawable.triangulodatristeza));
        lstFilmes.add(new Filmes("Coringa", "Exploração de Arthur", "Drama", R.drawable.coringa));
        lstFilmes.add(new Filmes("Triangulo da Tristeza", "Casal modelo de celebridades", "Comédia", R.drawable.triangulodatristeza));
        lstFilmes.add(new Filmes("Tudo em todo lugar", "Arrastada para aventura", "Comédia", R.drawable.tudoemtodolugar));
        lstFilmes.add(new Filmes("Coringa", "Exploração de Arthur", "Drama", R.drawable.coringa));
        lstFilmes.add(new Filmes("Triangulo da Tristeza", "Casal modelo de celebridades", "Comédia", R.drawable.triangulodatristeza));
        lstFilmes.add(new Filmes("Coringa", "Exploração de Arthur", "Drama", R.drawable.coringa));
        lstFilmes.add(new Filmes("Triangulo da Tristeza", "Casal modelo de celebridades", "Comédia", R.drawable.triangulodatristeza));
        lstFilmes.add(new Filmes("Tudo em todo lugar", "Arrastada para aventura", "Comédia", R.drawable.tudoemtodolugar));
        lstFilmes.add(new Filmes("Coringa", "Exploração de Arthur", "Drama", R.drawable.coringa));
        lstFilmes.add(new Filmes("Triangulo da Tristeza", "Casal modelo de celebridades", "Comédia", R.drawable.triangulodatristeza));

        idRecyclerView = findViewById(R.id.idRecyclerView);

        MyAdapter adapter = new MyAdapter(getApplicationContext(), lstFilmes);

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        idRecyclerView.setHasFixedSize(true);

        idRecyclerView.setAdapter(adapter);
    }
}