package com.example.signlang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.signlang.PageFour;
import com.example.signlang.PageOne;
import com.example.signlang.PageThree;
import com.example.signlang.PageTwo;


public class MainActivity  extends AppCompatActivity implements View.OnClickListener{

    public CardView card1, card2, card3, card4;



    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);
        card3 = (CardView) findViewById(R.id.c3);
        card4 = (CardView) findViewById(R.id.c4);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;

        if (v.getId() == R.id.c1) {
            i = new Intent(this, PageOne.class);
            startActivity(i);
        } else if (v.getId() == R.id.c2) {
            i = new Intent(this, PageTwo.class);
            startActivity(i);
        } else if (v.getId() == R.id.c3) {
            i = new Intent(this, PageThree.class);
            startActivity(i);
        } else if (v.getId() == R.id.c4) {
            i = new Intent(this, PageFour.class);
            startActivity(i);

        }
    }
}
