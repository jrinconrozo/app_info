package com.example.app_info;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = (Spinner) findViewById(R.id.spinner);

        String[] comidas = {"Pan", "Granos", "Fruta", "Carne", "Huevos", "Verduras", "Aceite", "Mantequilla"};

        ArrayAdapter<String> objeto = new ArrayAdapter(this, R.layout.spinnercom, comidas);
        sp1.setAdapter(objeto);
    }

    // metodo del menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menulat, menu); // esta linea se debe crear
        return super.onCreateOptionsMenu(menu);
    }
    // acciones del menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // se crea el switch tecleando
        switch (item.getItemId()) {

            case R.id.itemcarb:
                Toast.makeText(this, "CARBOHIDRATOS", Toast.LENGTH_SHORT).show();
                Intent irca = new Intent(this, Carbohidratos.class);
                startActivity(irca);
                break;


            case R.id.itemprot:
                Toast.makeText(this, "PROTEINAS", Toast.LENGTH_SHORT).show();
                Intent irpro = new Intent(this, Proteinas.class);
                startActivity(irpro);
                break;

            case R.id.itemgras:
                Toast.makeText(this, "GRASAS", Toast.LENGTH_SHORT).show();
                Intent irgra = new Intent(this, Grasas.class);
                startActivity(irgra);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    // metodo del boton con spinner

    public void mostrar(View view) {
        String seleccion = sp1.getSelectedItem().toString();

        if (seleccion.equalsIgnoreCase("Pan")) {
            Intent irca = new Intent(this, Carbohidratos.class);
            startActivity(irca);
        } else if (seleccion.equalsIgnoreCase("Granos")) {
            Intent irca = new Intent(this, Carbohidratos.class);
            startActivity(irca);
        } else if (seleccion.equalsIgnoreCase("Fruta")) {
            Intent irca = new Intent(this, Carbohidratos.class);
            startActivity(irca);
        } else if (seleccion.equalsIgnoreCase("Carne")) {
            Intent irca = new Intent(this, Proteinas.class);
            startActivity(irca);
        } else if (seleccion.equalsIgnoreCase("Huevos")) {
            Intent irca = new Intent(this, Proteinas.class);
            startActivity(irca);
        } else if (seleccion.equalsIgnoreCase("Verduras")) {
            Intent irca = new Intent(this, Proteinas.class);
            startActivity(irca);
        }else if (seleccion.equalsIgnoreCase("Aceite")) {
            Intent irca = new Intent(this, Grasas.class);
            startActivity(irca);
        }else if (seleccion.equalsIgnoreCase("Mantequilla")) {
            Intent irca = new Intent(this, Grasas.class);
            startActivity(irca);
        }
    }
}