package com.example.ex1_tarefa2_e_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void teste( View view){
        TextView somar = findViewById(R.id.clicks);
        Button acao = findViewById(R.id.clique);
        acao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                contador++;
                somar.setText("Número de vezes clicado: " + contador);
            }
        });
    }

   // public void somar(View view){

        //TextView soma = findViewById(R.id.clicks);
        //contador++;
       // soma.setText("Numero de vezes clicados " + contador);

    //}
}