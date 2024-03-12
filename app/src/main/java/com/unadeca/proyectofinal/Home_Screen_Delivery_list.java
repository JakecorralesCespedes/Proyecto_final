package com.unadeca.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home_Screen_Delivery_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_delivery_list);
    }

    public void ir(View view){
        Intent intent = new Intent(Home_Screen_Delivery_list.this,Tacontento.class);
        startActivity(intent);
    }
}