package mx.edu.itcolima.peliculas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView reciclador;
    RecyclerView.Adapter adaptador;
    RecyclerView.LayoutManager layoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List peliculas = new ArrayList();

        peliculas.add(new PeliculasModel(R.drawable.resacon, "¿Que paso ayer?", "vistos: 120"));
        peliculas.add(new PeliculasModel(R.drawable.rs, "Resonancia", "vistos: 130"));
        peliculas.add(new PeliculasModel(R.drawable.resacon,"¿Que paso ayer?","vistos: 120"));
        peliculas.add(new PeliculasModel(R.drawable.rs,"Resonancia","vistos: 130"));
        peliculas.add(new PeliculasModel(R.drawable.resacon,"¿Que paso ayer?","vistos: 120"));
        peliculas.add(new PeliculasModel(R.drawable.rs,"Resonancia","vistos: 130"));
        peliculas.add(new PeliculasModel(R.drawable.resacon,"¿Que paso ayer?","vistos: 120"));
        peliculas.add(new PeliculasModel(R.drawable.rs,"Resonancia","vistos: 130"));


        reciclador = (RecyclerView) findViewById(R.id.recilcador);
        reciclador.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(MainActivity.this);
        reciclador.setLayoutManager(layoutManager);
        adaptador = new PeliculasAdapter(peliculas);
        reciclador.setAdapter(adaptador);









    }
}
