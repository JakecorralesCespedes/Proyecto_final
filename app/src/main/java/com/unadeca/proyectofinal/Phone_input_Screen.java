package com.unadeca.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Phone_input_Screen extends AppCompatActivity {
    private EditText numeroEdt;
    private ImageView loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_input_screen);
        //Definir funciones de los botones
        ImageView btnInicioGoogle = findViewById(R.id.inicio_google);

        btnInicioGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Phone_input_Screen.this, Home_Screen_Delivery_list.class);
                startActivity(intent);
            }
        });
        initView();
    }

    private void initView() {
        numeroEdt = findViewById(R.id.numero_telefono);
        loginBtn = findViewById(R.id.Next);

        loginBtn.setOnClickListener(v -> {
            if (numeroEdt.getText().toString().isEmpty()) {
                Toast.makeText(Phone_input_Screen.this, "colocar numero de telefono registrado", Toast.LENGTH_SHORT).show();
            } else if (numeroEdt.getText().toString().equals("84558763")) {
                startActivity(new Intent(Phone_input_Screen.this, Home_Screen_Delivery_list.class));
            } else {
                Toast.makeText(Phone_input_Screen.this, "tu numero registrado es incorrecto", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
