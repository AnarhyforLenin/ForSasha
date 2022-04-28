package com.example.protoitpe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);



        findViewById(R.id.button1).setOnClickListener(v->{

            Intent intent2 = new Intent(MainActivity.this, Calendar.class);
            startActivity(intent2);

        });
        findViewById(R.id.button2).setOnClickListener(v->{

            Intent intent2 = new Intent(MainActivity.this, First_Game.class);
            startActivity(intent2);
        });
        Button button_em = (Button) findViewById(R.id.em);
        findViewById(R.id.tap).setOnClickListener(v->{

            RelativeLayout main_layout = (RelativeLayout) findViewById(R.id.main_layout);
            main_layout.startAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));

            //Intent intent_em = new Intent(MainActivity.this, Emergency_Activity.class);
            //startActivity(intent_em);

        });

    }
}