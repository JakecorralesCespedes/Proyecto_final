// integrantes gabriela Sarmento,Jake Corrales,Eddie Ponce
package com.unadeca.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tacontento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tacontento);
        //Definir funciones de los botones
        ImageView btnregresar = findViewById(R.id.atras);
        ImageView btntacos = findViewById(R.id.tacos);
        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tacontento.this, Home_Screen_Delivery_list.class);
                startActivity(intent);
            }
        });
        btntacos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tacontento.this, tacontento_agregar_carito.class);
                startActivity(intent);
            }
        });
    }
}
