package com.application.semester4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    CardView card1,card2,card3, card4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_menu);

        card1 = (CardView) findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this, PesanMakan.class);
                startActivity(intent);
            }
        });

        card2 = (CardView) findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this, PesanMakan.class);
                startActivity(intent);
            }
        });

        card3 = (CardView) findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this, PesanMakan.class);
                startActivity(intent);
            }
        });

        card4 = (CardView) findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuActivity.this, PesanMakan.class);
                startActivity(intent);
            }
        });
    }
}
