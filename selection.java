package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class selection extends AppCompatActivity implements View.OnClickListener{
    public CardView card1, card2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        card1=(CardView) findViewById(R.id.card1);
        card2=(CardView) findViewById(R.id.card2);
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.card1:
                i= new Intent(this,fac_home.class);
                startActivity(i);
                break;
            case R.id.card2:
                i= new Intent(this,Par_login.class);
                startActivity(i);
                break;

        }

    }
}