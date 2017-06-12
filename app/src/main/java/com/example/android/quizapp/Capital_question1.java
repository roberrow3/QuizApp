package com.example.android.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Capital_question1 extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital_question1);

        MainActivity.category ="capital";


    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Capital_question1.this,MainActivity.class);
        startActivity(intent);
    }


    public void onClickpta(View view) {
        Intent i = new Intent(Capital_question1.this,Capital_question2.class);
        startActivity(i);






        next( );

        MainActivity.score=MainActivity.score +1;


    }


    public void onClickjhb(View view) {
        Intent i = new Intent(Capital_question1.this,Capital_question2.class);
        startActivity(i);




    }



    public void onClickcpt(View view) {
            Intent i = new Intent(Capital_question1.this,Capital_question2.class);
        startActivity(i);







    }


    public void back(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    public void next( )
    {
        Intent intent = new Intent(this,Capital_question2.class);
        startActivity(intent);
    }

    private void updateScore(int point){

    }


}




