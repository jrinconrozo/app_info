package com.example.app_info;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Grasas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grasas);
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

            case R.id.itemprot:
                Toast.makeText(this, "PROTEINAS", Toast.LENGTH_SHORT).show();
                Intent irpro = new Intent(this, Proteinas.class);
                startActivity(irpro);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    public void imagenA (View view){
        Toast.makeText(this, "ANTERIOR", Toast.LENGTH_SHORT).show();
        Intent irpro = new Intent(this, Proteinas.class);
        startActivity(irpro);
    }
}