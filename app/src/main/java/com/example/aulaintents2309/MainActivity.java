package com.example.aulaintents2309;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void vaiParaOutra(View view) {
        //Cria a nova intent que vai ser mandada para outra tela
        Intent minhaIntent = new Intent(this, TelaSecundaria.class);

        //Pega os dados que foram digitados nos edit Text dessa tela
        EditText pegaNome = findViewById(R.id.et_Nome);
        EditText pegaCurso = findViewById(R.id.et_Curso);
        String nomeASerEnviado = pegaNome.getText().toString();
        String cursoASerEnviado = pegaCurso.getText().toString();
        
        //coloca esses dados coletados da interface na intent através
        //do método putExtra
        minhaIntent.putExtra("nome",nomeASerEnviado);
        minhaIntent.putExtra("curso", cursoASerEnviado);
        //inicia a atividade da outra tela
        startActivity(minhaIntent);
    }
}
