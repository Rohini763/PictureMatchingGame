package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

//import android.media.Image;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.myproject.Images2_Adapter;
import com.example.myproject.Images5_Adapter;
import com.example.myproject.Images_Adapter;
import com.example.myproject.R;

public class Images9 extends AppCompatActivity {

    ImageView curView = null;
    private  int countPair = 0 ;
    final int[] drawable = new int[]{
            R.drawable.hippo,
            R.drawable.dragon,
            R.drawable.elephent,
            R.drawable.dog,
            R.drawable.monky,
            R.drawable.lion,
            R.drawable.kachuaa,
            R.drawable.jiraph,
            R.drawable.kangaru,
            R.drawable.fish,
            R.drawable.panda,
            R.drawable.zebra,
            R.drawable.cherries,
            R.drawable.grapes,
            R.drawable.apple,

    };

    int[] pos = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int currentPos = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images9);



        Images9_Adapter imageAdapter = new Images9_Adapter(this);
        GridView gridView = (GridView)findViewById(R.id.GridView9);
        gridView.setAdapter(imageAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (currentPos < 0 ) {
                    currentPos = position;
                    curView = (ImageView) view;
                    ((ImageView) view).setImageResource(drawable[pos[position]]);
                }
                else {
                    if (currentPos == position) {
                        ((ImageView) view).setImageResource(R.drawable.hidden);
                    } else if (pos[currentPos] != pos[position]) {
                        curView.setImageResource(R.drawable.hidden);
                        Toast.makeText(com.example.myproject.Images9.this, "Not Match!", Toast.LENGTH_LONG).show();
                    } else {
                        ((ImageView) view).setImageResource(drawable[pos[position]]);
                        countPair++;
                        if (countPair == 30) {
                            Toast.makeText(com.example.myproject.Images9.this, "You Win!", Toast.LENGTH_LONG).show();
                        }
                    }
                    currentPos = -1;
                }
            }
        });
    }
}
