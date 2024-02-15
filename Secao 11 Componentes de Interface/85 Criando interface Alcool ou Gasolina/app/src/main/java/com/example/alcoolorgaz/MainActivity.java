package com.example.alcoolorgaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText edtPriceAlcohol, edtPriceGaz;
    private TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPriceAlcohol = findViewById(R.id.edtPriceAlcohol);
        edtPriceGaz = findViewById(R.id.edtPriceGaz);
        txtResult = findViewById(R.id.txtResult);
    }

    public void calculate(View view) {
        Double priceAlcohol, priceGaz;
        try {
            priceAlcohol = Double.parseDouble(edtPriceAlcohol.getText().toString());
            priceGaz = Double.parseDouble(edtPriceGaz.getText().toString());
        } catch (NumberFormatException e) {
            txtResult.setText("Preencha os campos com valores validos!");
            return;
        }

        if (priceAlcohol / priceGaz < 0.7) {
            txtResult.setText("Abasteça com alcool");
        } else
            txtResult.setText("Abasteça com gasolina");
    }
}