package com.example.aulaintents2309;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaSecundaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_secundaria);
        Intent estaIntent = getIntent();
        TextView mostraInfo = findViewById(R.id.tv_mostraInfo);
        //Criar strings para pegar o texto recebido
        String nomePessoa = estaIntent.getStringExtra("nome");
        String cursoPessoa = estaIntent.getStringExtra("curso");

        mostraInfo.setText("Olá "+nomePessoa+" Seja bem vindo ao curso de "+cursoPessoa);


    }

    public void voltar(View view) {
        finish();
    }
}
