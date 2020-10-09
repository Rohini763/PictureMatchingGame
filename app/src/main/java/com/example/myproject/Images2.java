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

public class Images2 extends AppCompatActivity {

    ImageView curView = null;
    private  int countPair = 0 ;
    final int[] drawable = new int[]{
            R.drawable.hippo,
            R.drawable.dragon,
            R.drawable.elephent,
            R.drawable.dog,
            R.drawable.monky,
            R.drawable.lion,
    };

    int[] pos = {0,1,2,3,4,5,0,1,2,3,4,5};
    int currentPos = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images2);

        Images2_Adapter imageAdapter = new Images2_Adapter(this);
        GridView gridView = (GridView)findViewById(R.id.GridView2);
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
                        Toast.makeText(com.example.myproject.Images2.this, "Not Match!", Toast.LENGTH_LONG).show();
                    } else {
                        ((ImageView) view).setImageResource(drawable[pos[position]]);
                        countPair++;
                        if (countPair == 12) {
                            Toast.makeText(com.example.myproject.Images2.this, "You Win!", Toast.LENGTH_LONG).show();
                        }
                    }
                    currentPos = -1;
                }
            }
        });
    }
}

