package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class
ScoreActivity extends AppCompatActivity {


    private Button main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        TextView tvScore = (TextView) findViewById(R.id.tvScore);

        double high = 5;
        double low = MainActivity.score;
        double divScore = low / high;
        double tot = divScore * 100;
        tvScore.setText(" Total Score = " + (int) tot + "%");


        main = (Button) findViewById(R.id.main);


        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                MainActivity.score = 0;

            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ScoreActivity.this,MainActivity.class);
        startActivity(intent);
    }


    public void tryAgain(View view){

        if(  MainActivity.category =="bible"){
            Intent intent = new Intent(getApplicationContext(), Bible_Question1.class);
            startActivity(intent);
            MainActivity.score = 0;
        }
        else if(MainActivity.category =="capital"){
            Intent intent = new Intent(getApplicationContext(), Capital_question1.class);
            startActivity(intent);
            MainActivity.score = 0;
        }
        else if(MainActivity.category =="english"){
            Intent intent = new Intent(getApplicationContext(), English_Question1.class);
            startActivity(intent);
            MainActivity.score = 0;
        }
        else if(MainActivity.category =="general"){
            Intent intent = new Intent(getApplicationContext(), General_Question1.class);
            startActivity(intent);
            MainActivity.score = 0;
        }
        else
        {
            Intent intent = new Intent(getApplicationContext(), TrueFalse_Question1.class);
            startActivity(intent);
            MainActivity.score = 0;
        }
    }




}




