package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Others_Levels3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others__levels3);


        Button b7 = (Button)findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Others_Levels3.this,Images7.class);
                startActivity(intent);
            }
        });

        Button b8 = (Button)findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Others_Levels3.this,Images8.class);
                startActivity(intent);
            }
        });

        Button b9 = (Button)findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Others_Levels3.this,Images9.class);
                startActivity(intent);
            }
        });
    }
}