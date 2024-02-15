package com.example.togglebuttonswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private TextView textSwitch, textToggle;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch switchPassword;
    private ToggleButton togglePassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchPassword = findViewById(R.id.switchPassword);
        togglePassword = findViewById(R.id.togglePassword);
        textSwitch = findViewById(R.id.textSwitch);
        textToggle = findViewById(R.id.textToggle);

        addSetOnListener();
    }

    private void addSetOnListener() {
        switchPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textSwitch.setText("Swith ligado");
                } else   {
                    textSwitch.setText("Swith desligado");
                }
            }
        });

        togglePassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textToggle.setText("Toggle ligado");
                } else {
                    textToggle.setText("Toggle desligado");
                }
            }
        });
    }
}