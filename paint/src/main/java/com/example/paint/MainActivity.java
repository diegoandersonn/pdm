package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.skydoves.colorpickerview.ColorEnvelope;
import com.skydoves.colorpickerview.ColorPickerDialog;
import com.skydoves.colorpickerview.listeners.ColorEnvelopeListener;

public class MainActivity extends AppCompatActivity {
        SimplePaint simplePaint;
        Button colorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simplePaint = findViewById(R.id.simplePaint2);
        colorButton = findViewById(R.id.button);
        colorButton.setOnClickListener(view -> {
            new ColorPickerDialog.Builder(this)
                    .setTitle("ColorPicker Dialog")
                    .setPreferenceName("MyColorPickerDialog")
                    .setPositiveButton("Confirmado", new ColorEnvelopeListener() {
                @Override
                public void onColorSelected(ColorEnvelope envelope, boolean fromUser) {
                    setColor(envelope);
                }
            }).setNegativeButton("Cancelado",
          new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
          }).attachAlphaSlideBar(true) // the default value is true.
      .attachBrightnessSlideBar(true)  // the default value is true.
      .setBottomSpace(12) // set a bottom space between the last slidebar and buttons.
      .show();
        });
    }
    private void setColor(ColorEnvelope envelope) {
        simplePaint.myPaint.setColor(envelope.getColor());
        colorButton.setBackgroundColor(envelope.getColor());
    }
}