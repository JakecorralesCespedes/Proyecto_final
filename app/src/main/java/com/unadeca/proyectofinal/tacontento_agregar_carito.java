// integrantes gabriela Sarmento,Jake Corrales,Eddie Ponce
package com.unadeca.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class tacontento_agregar_carito extends AppCompatActivity {
    private int cantidadProductos = 0;
    private double precioUnitario = 15.0; //precio del producto unitario

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tacontento_agregar_carito);
        //definir funciones del los botones y el text view total y cantidad
        Button btnAgregar = findViewById(R.id.suma);
        Button btnRestar = findViewById(R.id.menos);
        TextView txtnum = findViewById(R.id.txtcantidad);
        TextView txtTotal = findViewById(R.id.Precio_final);
        ImageView btnregresar = findViewById(R.id.atras2);
        ImageView btn_ir_carrito = findViewById(R.id.agregar_carrito);
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidadProductos++;
                actualizarCantidadTotal(txtnum);
                actualizarPrecioTotal(txtTotal);
            }
        });
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cantidadProductos > 0){
                    cantidadProductos--;
                    actualizarCantidadTotal(txtnum);
                    actualizarPrecioTotal(txtTotal);
                }
            }
        });
        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tacontento_agregar_carito.this, Tacontento.class);
                startActivity(intent);
            }
        });
        btn_ir_carrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tacontento_agregar_carito.this, pagar_carrito.class);
                startActivity(intent);
            }
        });
    }
    private void actualizarCantidadTotal(TextView txtnum) {
        double Cantidadproducto = cantidadProductos;
        txtnum.setText("" + Cantidadproducto);
    }
    private void actualizarPrecioTotal(TextView txtTotal){
        double CantidadTotal = cantidadProductos * precioUnitario;
        txtTotal.setText("$" + CantidadTotal);

    }
}