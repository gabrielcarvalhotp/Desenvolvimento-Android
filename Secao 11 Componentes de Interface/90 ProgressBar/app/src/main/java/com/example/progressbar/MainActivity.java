package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar pgbHorizontal;
    private ProgressBar pgbCircle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pgbHorizontal = findViewById(R.id.pbrHorizontal);
        pgbCircle = findViewById(R.id.pbrCircle);

        pgbCircle.setVisibility(View.GONE);
    }
    private int progess = 0;
   public void load(View view) {
       pgbCircle.setVisibility(View.VISIBLE);
       progess++;
       pgbHorizontal.setProgress(progess);

       if (pgbHorizontal.getProgress() == pgbHorizontal.getMax())
           pgbCircle.setVisibility(View.GONE);
   }
}