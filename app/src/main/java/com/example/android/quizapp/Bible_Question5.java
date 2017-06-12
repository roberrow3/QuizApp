package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bible_Question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bible__question5);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Bible_Question5.this,MainActivity.class);
        startActivity(intent);
    }

    public void onClickjrs(View view) {
        Intent i = new Intent(Bible_Question5.this, ScoreActivity.class);
        startActivity(i);
        next();
    }


    public void onClickEGY(View view) {
        Intent i = new Intent(Bible_Question5.this, ScoreActivity.class);
        startActivity(i);
        next();

        MainActivity.score = MainActivity.score + 1;


    }

    public void back(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    public void next() {
        Intent intent = new Intent(this, ScoreActivity.class);
        startActivity(intent);
    }



    private void updateScore(int point) {

    }
}
