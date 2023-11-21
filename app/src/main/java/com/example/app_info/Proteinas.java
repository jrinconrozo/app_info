package com.example.app_info;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Proteinas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proteinas);
    }


    // menu lateral
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menulat,menu); // esta linea se debe crear
        return super.onCreateOptionsMenu(menu);
    }
    // acciones del menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // se crea el switch tecleando
        switch (item.getItemId()){

            case R.id.iteminicio:
                Toast.makeText(this, "INICIO", Toast.LENGTH_SHORT).show();
                Intent irin = new Intent(this, MainActivity.class);
                startActivity(irin);
                break;


            case R.id.itemcarb:
                Toast.makeText(this, "CARBOHIDRATOS", Toast.LENGTH_SHORT).show();
                Intent ircar = new Intent(this, Carbohidratos.class);
                startActivity(ircar);
                break;

            case R.id.itemgras:
                Toast.makeText(this, "GRASAS", Toast.LENGTH_SHORT).show();
                Intent irgra = new Intent(this, Grasas.class);
                startActivity(irgra);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    public void imagenS (View view){
        Toast.makeText(this, "SIGUIENTE", Toast.LENGTH_SHORT).show();
        Intent irgra = new Intent(this, Grasas.class);
        startActivity(irgra);
    }

    public void imagenA (View view){
        Toast.makeText(this, "ANTERIOR", Toast.LENGTH_SHORT).show();
        Intent ircar = new Intent(this, Carbohidratos.class);
        startActivity(ircar);
    }
}