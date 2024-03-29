package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void drawNumber(View view) {
        TextView text = findViewById(R.id.textViewSelectedNumber);
        int number = new Random().nextInt(11);
        text.setText(R.string.selected_number + number);
    }

}