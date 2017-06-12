package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bible_Question1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bible__question1);

        MainActivity.category ="bible";
    }

    public void onClickkns(View view) {
        Intent i = new Intent(Bible_Question1.this,Bible_Question2.class);
        startActivity(i);
        next( );

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Bible_Question1.this,MainActivity.class);
        startActivity(intent);
    }


    public void onClickknh(View view) {
        Intent i = new Intent(Bible_Question1.this,Bible_Question2.class);
        startActivity(i);
        next( );

        MainActivity.score=MainActivity.score +1;




    }






    public void back(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    public void next( )
    {
        Intent intent = new Intent(this,Bible_Question2.class);
        startActivity(intent);
    }

    private void updateScore(int point){

    }

}
