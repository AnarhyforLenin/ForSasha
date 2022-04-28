package com.example.protoitpe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class First_Game extends AppCompatActivity {

    private int value;
    public boolean isChecked;
    Button button;
    SwitchCompat switch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//TODO: vibration
        TextView valueText = findViewById(R.id.value);
        Button button = (Button) findViewById(R.id.tap);
        findViewById(R.id.tap).setOnClickListener(v->{
            value++;
            valueText.setText(String.valueOf(value));
            button.setEnabled(false);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            button.setEnabled(true);


        });
        switch1 = findViewById(R.id.customSwitch);
        switch1.setChecked(false);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Intent intent1 = new Intent(First_Game.this, Second_Game.class);
                    startActivity(intent1);
                }
            }
    });
    //TODO second button

}
};
