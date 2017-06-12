package com.example.android.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Capital_question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital_question2);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Capital_question2.this,MainActivity.class);
        startActivity(intent);
    }


    public void onClickspn(View view) {
        Intent i = new Intent(Capital_question2.this,Capital_question3.class);
        startActivity(i);
        MainActivity.score=MainActivity.score +1;




    }


    public void onClickfrn(View view) {
        Intent i = new Intent(Capital_question2.this,Capital_question3.class);
        startActivity(i);


    }


    public void onClickeng(View view) {
        Intent i = new Intent(Capital_question2.this,Capital_question3.class);
        startActivity(i);
    }


    public void back(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    public void next(View view)
    {
        Intent intent = new Intent(this,Capital_question3.class);
        startActivity(intent);
    }
}


