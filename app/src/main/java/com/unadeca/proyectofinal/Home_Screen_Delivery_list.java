package com.unadeca.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Home_Screen_Delivery_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_delivery_list);
        //definir funciones del los botones
        ImageView btnDelivery = findViewById(R.id.tacontento);
//        Button btnRestar = findViewById(R.id.menos);
//        TextView txtnum = findViewById(R.id.txtcantidad);
//        TextView txtTotal = findViewById(R.id.Precio_final);
        btnDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Screen_Delivery_list.this, Tacontento.class);
                startActivity(intent);
            }
        });
    }
}

