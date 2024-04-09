package com.unadeca.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class pagar_carrito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagar_carrito);
        //Definir funciones de los botones
        ImageView btnregresar = findViewById(R.id.atras3);
        ImageView btnpagar = findViewById(R.id.buttonpagar);
        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pagar_carrito.this, tacontento_agregar_carito.class);
                startActivity(intent);
            }
        });
        btnpagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pagar_carrito.this, Pago_final.class);
                startActivity(intent);
            }
        });
    }
}