package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

//import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.myproject.Images_Adapter;
import com.example.myproject.R;

public class Images4 extends AppCompatActivity {

    ImageView curView = null;
    private  int countPair = 0 ;
    final int[] drawable = new int[]{
            R.drawable.hippo,
            R.drawable.dragon,
            R.drawable.elephent,
            R.drawable.dog,
            R.drawable.lion,
            R.drawable.monky,
    };

    int[] pos = {0,2,0,2,5,4,3,1,1,3,5,4};
    int currentPos = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images4);

        Images4_Adapter imageAdapter = new Images4_Adapter(this);
        GridView gridView = (GridView)findViewById(R.id.GridView4);
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
                        Toast.makeText(com.example.myproject.Images4.this, "Not Match!", Toast.LENGTH_LONG).show();
                    } else {
                        ((ImageView) view).setImageResource(drawable[pos[position]]);
                        countPair++;
                        if (countPair == 12) {
                            Toast.makeText(com.example.myproject.Images4.this, "You Win!", Toast.LENGTH_LONG).show();
                        }
                    }
                    currentPos = -1;
                }
            }
        });
    }
}

