package com.example.caixadeselecao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbxGreen;
    private CheckBox cbxYallow;
    private CheckBox cbxRed;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbxGreen = findViewById(R.id.cbxGreen);
        cbxYallow = findViewById(R.id.cbxYallow);
        cbxRed = findViewById(R.id.cbxRed);
        txtResult = findViewById(R.id.txtResult);
    }

    public void onClickValidation(View view) {
        String phase = "";
        if (cbxGreen.isChecked()) {
            phase = cbxGreen.getText().toString() + " está selecionado";
        }
        if (cbxYallow.isChecked()) {
            phase = phase + " - " + cbxYallow.getText().toString() + " está selecionado";
        }
        if (cbxRed.isChecked()) {
            phase = phase + " - " + cbxRed.getText().toString() + " está selecionado";
        }

        txtResult.setText(phase);
    }

}