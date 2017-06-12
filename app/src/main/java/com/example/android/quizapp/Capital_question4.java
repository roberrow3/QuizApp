package com.example.android.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Capital_question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital_question4);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Capital_question4.this,MainActivity.class);
        startActivity(intent);
    }

    public void onClickisl(View view) {
        Intent i = new Intent(Capital_question4.this,Capital_question5.class);
        startActivity(i);

        MainActivity.score=MainActivity.score +1;
    }


    public void onClicktky(View view) {
        Intent i = new Intent(Capital_question4.this,Capital_question5.class);
        startActivity(i);
    }


    public void onClicklsk(View view) {
        Intent i = new Intent(Capital_question4.this,Capital_question5.class);
        startActivity(i);
    }


    public void back(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    public void next(View view)
    {
        Intent intent = new Intent(this,Capital_question5.class);
        startActivity(intent);
    }
}
