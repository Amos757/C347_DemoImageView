package com.example.c347_demoimageview;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iV1;
    ImageView iV2;
    ImageView iV3;
    ImageView iV4;
    ImageView iV5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Day 1
        iV1 = findViewById(R.id.iV1);
        iV1.setImageResource(R.drawable.day1);
        //Day 2
        iV2 = findViewById(R.id.iV2);
        iV2.setImageResource(R.drawable.day2);
        //Day 3
        iV3 = findViewById(R.id.iV3);
        iV3.setImageResource(R.drawable.day3);
        //Day 4
        iV4 = findViewById(R.id.iV4);
        iV4.setImageResource(R.drawable.day4);
        //Day 5
        iV5 = findViewById(R.id.iV5);
        iV5.setImageResource(R.drawable.day5);

    }
}
