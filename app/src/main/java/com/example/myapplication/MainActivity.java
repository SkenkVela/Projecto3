package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt1, txt2;
    Button btn_executar;
    TextView lbl_resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.txt_primeiro_nome);
        txt2 = findViewById(R.id.txt_segundo_nome);
        btn_executar = findViewById(R.id.btn_executar);
        lbl_resultado = findViewById(R.id.lbl_resultado);

        btn_executar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome1, nome2;
                nome1 = txt1.getText().toString();
                nome2 = txt2.getText().toString();
                executa(nome1,nome2);
            }
        });
    }
    public void executa(String nome1, String nome2){
        if(nome1.length() == 0 && nome2.length() > 0){
            Toast.makeText(MainActivity.this,"Digite o primeiro nome",Toast.LENGTH_SHORT).show();
        }
        else if(nome2.length() == 0 && nome1.length() > 0){
        Toast.makeText(MainActivity.this,"Digite o segundo nome", Toast.LENGTH_SHORT).show();
        }
        else if(nome2.length() == 0 && nome1.length() == 0){
        Toast.makeText(MainActivity.this, "Os campos estão vazios", Toast.LENGTH_SHORT).show();
        }
        lbl_resultado.setText("Olá " + nome1 +" " + nome2 +" seja bem-vindo");
    }
}