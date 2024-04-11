// integrantes gabriela Sarmento,Jake Corrales,Eddie Ponce
package com.unadeca.proyectofinal;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.ClipData;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;

public class Pago_final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago_final);
        Button btnFlechadevolverse = findViewById(R.id.flechadevolverse);
        ImageView imgSiguiente = findViewById(R.id.siguiente);

        btnFlechadevolverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pago_final.this, pagar_carrito.class);
                startActivity(intent);
            }
        });

        imgSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pago_final.this, DeliveryProcess.class);
                startActivity(intent);


            }

        });


    }

}