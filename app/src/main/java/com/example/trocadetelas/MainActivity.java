package com.example.trocadetelas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnTrocaTela, btnVoltaTela;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarregarTelaPrincipal();
    }

    ;

    public void CarregarTelaPrincipal() {
        setContentView(R.layout.activity_main);
        btnTrocaTela = (Button) findViewById(R.id.btnTrocaTela);
        btnTrocaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTela2();
            }
        });
    };

    public void CarregarTela2() {
        setContentView(R.layout.tela2);
        btnVoltaTela = (Button) findViewById(R.id.btnVoltarTela);
        btnVoltaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaPrincipal();
            }
        });
    }
}