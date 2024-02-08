package com.example.caixasdetexto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtName;
    private TextInputEditText txtEmail;
    private TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtResult = findViewById(R.id.txtResult);
    }

    public void onClickSend(View view) {
        String name = edtName.getText().toString();
        String email = txtEmail.getText().toString();
        txtResult.setText("Nome: " +  name + " Email: " + email);
    }

    public void onClickClear(View view) {
        edtName.setText("");
        txtEmail.setText("");
        txtResult.setText("");
    }
}