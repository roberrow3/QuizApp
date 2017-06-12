package com.example.android.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Capital_question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital_question3);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Capital_question3.this,MainActivity.class);
        startActivity(intent);
    }

    public void onClickrome(View view) {
        Intent i = new Intent(Capital_question3.this,Capital_question4.class);
        startActivity(i);

        MainActivity.score=MainActivity.score +1;
    }


    public void onClickmadrid(View view) {
        Intent i = new Intent(Capital_question3.this,Capital_question4.class);
        startActivity(i);
    }


    public void onClickisrael(View view) {
        Intent i = new Intent(Capital_question3.this,Capital_question4.class);
        startActivity(i);

    }


    public void back(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    public void next(View view)
    {
        Intent intent = new Intent(this,Capital_question4.class);
        startActivity(intent);
    }
}
