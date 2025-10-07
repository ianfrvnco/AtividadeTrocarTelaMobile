package com.example.trocadetelas;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnVoltarTela, btnTrocarTela;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.tela2);

        btnTrocarTela = findViewById(R.id.btnTrocaTela);
        btnVoltarTela = findViewById(R.id.btnVoltarTela);

        });
    }
}