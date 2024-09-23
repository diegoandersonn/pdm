package br.ifsc.edu.br.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.textView);
                EditText edMin =findViewById(R.id.edMin);
                EditText edMax =findViewById(R.id.edMax);
                Random random= new Random();
                int nmin = (Integer.parseInt(edMin.getText().toString()));
                int nmax = (Integer.parseInt(edMax.getText().toString()));
                textView.setText(Integer.toString(random.nextInt(nmax-nmin+1)+nmin));
            }
        });
    }
}