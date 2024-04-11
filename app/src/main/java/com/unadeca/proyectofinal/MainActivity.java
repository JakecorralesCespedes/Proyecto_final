// integrantes gabriela Sarmento,Jake Corrales,Eddie Ponce
package com.unadeca.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private int progressStatus = 0;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                progressStatus++;
                progressBar.setProgress(progressStatus);
                if (progressStatus >= 100) {
                    Intent intent =  new Intent(MainActivity.this, Phone_input_Screen.class);
                    startActivity(intent);
                    timer.cancel();
                    finish();
                }
            }
        };

        timer = new Timer();
        timer.schedule(tarea, 0, 50); // Actualiza cada 50 milisegundos
    }
}
