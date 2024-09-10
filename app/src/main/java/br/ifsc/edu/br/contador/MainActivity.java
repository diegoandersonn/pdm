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
        Button myBtn = findViewById(R.id.button);
        TextView tv = findViewById(R.id.textView);
        EditText edMin =findViewById(R.id.edMin);
        EditText edMax =findViewById(R.id.edMax);
        myBtn.setText("Me aperta");
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b=(Button) view;
                TextView t=(TextView) view;
                Random random = new Random();
                int min = (Integer.parseInt(edMin.getText().toString()));
                int max = (Integer.parseInt(edMax.getText().toString()));
                t.setText(Integer.toString(random.nextInt(min-max)+min));
            }
        });
    }
}