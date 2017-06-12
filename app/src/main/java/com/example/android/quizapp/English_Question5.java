package com.example.android.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class English_Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english__question5);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(English_Question5.this,MainActivity.class);
        startActivity(intent);
    }
    public void onClickdvp(View view) {
        Intent i = new Intent(English_Question5.this,ScoreActivity.class);
        startActivity(i);
        MainActivity.score=MainActivity.score +1;

        next( );
    }


    public void onClickown(View view) {
        Intent i = new Intent(English_Question5.this,ScoreActivity.class);
        startActivity(i);
        MainActivity.score=MainActivity.score +1;


        next( );
    }



    public void back(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    public void next( )
    {
        Intent intent = new Intent(this,ScoreActivity.class);
        startActivity(intent);
    }
}
