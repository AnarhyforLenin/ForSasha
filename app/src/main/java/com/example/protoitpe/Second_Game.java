package com.example.protoitpe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;

public class Second_Game extends AppCompatActivity {

    SwitchCompat switch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_game);

        switch1 = findViewById(R.id.customSwitch);
        switch1.setChecked(true);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked) {
                    Intent intent1 = new Intent(Second_Game.this, First_Game.class);
                    startActivity(intent1);
                }
            }
        });
    }
}