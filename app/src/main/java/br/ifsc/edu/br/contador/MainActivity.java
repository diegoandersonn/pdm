package br.ifsc.edu.br.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edText = findViewById(R.id.edText);
                TextView tvPeso = findViewById(R.id.tvPeso);
                TextView tvEuro = findViewById(R.id.tvEuro);
                TextView tvLibra = findViewById(R.id.tvLibra);
                TextView tvDolar = findViewById(R.id.tvDolar);
                valor = Double.parseDouble(edText.getText().toString()) * 0.18;
                tvDolar.setText(String.format("%.2f Dólares", valor));
                valor = Double.parseDouble(edText.getText().toString()) * 180;
                tvPeso.setText(String.format("%.2f Pesos", valor));
                valor = Double.parseDouble(edText.getText().toString()) * 0.16;
                tvEuro.setText(String.format("%.2f Euros", valor));
                valor = Double.parseDouble(edText.getText().toString()) * 0.14;
                tvLibra.setText(String.format("%.2f Libras", valor));
            }
        });
    }
}