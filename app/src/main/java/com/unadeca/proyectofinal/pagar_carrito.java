package com.unadeca.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class pagar_carrito extends AppCompatActivity {
    private int cantidad_tacos = 0;
    private double precio_tacos = 15;

    private int cantidad_huaraches = 0;
    private double precio_huaraches = 25;

    private int cantidad_tacos_res = 0;

    private double precio_tacos_res = 15;

    private int cantidad_bowl_carne = 0;

    private double precio_bowl_carne = 12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagar_carrito);
        //Definir funciones de los botones
        ImageView btnregresar = findViewById(R.id.atras3);
        ImageView btnpagar = findViewById(R.id.buttonpagar);
        ImageView btnsumacar1 = findViewById(R.id.sumacar1);
        ImageView btnrestacar1 = findViewById(R.id.restacar1);
        ImageView btnsumacar2 = findViewById(R.id.sumacar2);
        ImageView btnrestacar2 = findViewById(R.id.restacar2);
        ImageView btnsumacar3 = findViewById(R.id.sumacar3);
        ImageView btnrestacar3 = findViewById(R.id.restacar3);
        ImageView btnsumacar4 = findViewById(R.id.sumacar4);
        ImageView btnrestacar4 = findViewById(R.id.restacar4);
        ImageView btn_ir_carrito = findViewById(R.id.buttonpagar);
        TextView cantidad1 = findViewById(R.id.cantidadtotal1);
        TextView cantidad2 = findViewById(R.id.cantidadtotal2);
        TextView cantidad3 = findViewById(R.id.cantidadtotal3);
        TextView cantidad4 = findViewById(R.id.cantidadtotal4);
        TextView subtotal = findViewById(R.id.subtotal);
        TextView envio = findViewById(R.id.envio);
        TextView total = findViewById(R.id.total);
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
        btnsumacar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidad_tacos++;
                actualizar_cantidad_total(cantidad1);
                actualizar_precio_producto(subtotal);
            }
        });
        btnrestacar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cantidad_tacos > 0){
                    cantidad_tacos--;
                    actualizar_cantidad_total(cantidad1);
                    actualizar_precio_producto(subtotal);
                }
            }
        });
        btnsumacar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidad_huaraches++;
                actualizar_cantidad_total(cantidad2);
                actualizar_precio_producto(subtotal);
            }
        });
        btnrestacar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cantidad_huaraches > 0) {
                    cantidad_huaraches--;
                    actualizar_cantidad_total(cantidad2);
                    actualizar_precio_producto(subtotal);
                }
            }
        });
        btnsumacar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidad_tacos_res++;
                actualizar_cantidad_total(cantidad3);
                actualizar_precio_producto(subtotal);
            }
        });
        btnrestacar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cantidad_tacos_res > 0) {
                    cantidad_tacos_res--;
                    actualizar_cantidad_total(cantidad3);
                    actualizar_precio_producto(subtotal);
                }
            }
        });
        btnsumacar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidad_bowl_carne++;
                actualizar_cantidad_total(cantidad4);
                actualizar_precio_producto(subtotal);
            }
        });
        btnrestacar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cantidad_bowl_carne > 0) {
                    cantidad_bowl_carne--;
                    actualizar_cantidad_total(cantidad4);
                    actualizar_precio_producto(subtotal);
                }
            }
        });
    }

    private void actualizar_cantidad_total(TextView cantidad1, cantidad2, cantidad3, cantidad4) {
        double cantidad_total = cantidad_tacos;
        cantidad1.setText("" + cantidad_total);

        double cantidad_total = cantidad_tacos;
        cantidad2.setText("" + cantidad_total);

        double cantidad_total = cantidad_tacos;
        cantidad3.setText("" + cantidad_total);

        double cantidad_total = cantidad_tacos;
        cantidad4.setText("" + cantidad_total);


    }

        // En la actividad de origen

        Intent intent = new Intent(this, Pago_final.class);
        int Subtotal = Subtotal
        intent.putExtra("clave", valor); // 'valor' es el dato que quieres enviar

        startActivity(intent);


    }
}