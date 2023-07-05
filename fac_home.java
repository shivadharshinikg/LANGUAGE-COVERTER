package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fac_home extends AppCompatActivity implements View.OnClickListener {
    public CardView c1,c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fac_home);
        c1=(CardView) findViewById(R.id.c1);
        c1.setOnClickListener(this);
        c2=(CardView) findViewById(R.id.c2);
        c2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.c1:
                i= new Intent(this,grade1_home.class);
                startActivity(i);
                break;
            case R.id.c2:
                i= new Intent(this,grade1_home.class);
                startActivity(i);
                break;
        }
    }
}