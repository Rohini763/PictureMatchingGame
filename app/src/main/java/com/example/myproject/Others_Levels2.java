package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Others_Levels2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others__levels2);


        Button b4 = (Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Others_Levels2.this,Images4.class);
                startActivity(intent);
            }
        });

        Button b5 = (Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Others_Levels2.this,Images5.class);
                startActivity(intent);
            }
        });

        Button b6 = (Button)findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Others_Levels2.this,Images6.class);
                startActivity(intent);
            }
        });
    }
}


