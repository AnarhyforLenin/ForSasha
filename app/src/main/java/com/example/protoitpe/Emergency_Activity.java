package com.example.protoitpe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Emergency_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        this.startActivity(new Intent(this, MainActivity.class));
        this.overridePendingTransition(R.anim.activity_in, R.anim.activity_out);

    }
}