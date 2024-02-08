package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickRock(View view) {
        play(0);
    }
    public void onClickPaper(View view) {
        play(1);
    }
    public void onClickScissor(View view) {
        play(2);
    }
    private void play(int userChoose) {
        ImageView imageView = findViewById(R.id.imageResult);
        int appChoose = new Random().nextInt(3);
        switch (appChoose) {
            case 0:
                imageView.setImageResource(R.drawable.rock);
                break;
            case 1:
                imageView.setImageResource(R.drawable.paper);
                break;
            case 2:
                imageView.setImageResource(R.drawable.scissors);
                break;
        }

        TextView textView = findViewById(R.id.txtResult);
        if (userChoose == appChoose)
            textView.setText(R.string.A_tie);
        else {
            if ((userChoose == 0 && appChoose == 2) || (userChoose == 1 && appChoose == 0) || (userChoose == 2 && appChoose == 1))
                textView.setText(R.string.user_win);
            else
                textView.setText(R.string.app_win);
        }
    }
}