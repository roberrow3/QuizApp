package com.example.android.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;
import static com.example.android.quizapp.R.id.main;

public class Capital_question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital_question5);


    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Capital_question5.this,MainActivity.class);
        startActivity(intent);
    }

    public void onClickmlw(View view) {
        Intent i = new Intent(Capital_question5.this,ScoreActivity.class);
        startActivity(i);

        MainActivity.score=MainActivity.score +1;



    }


    public void onClickmpt(View view) {
        Intent i = new Intent(Capital_question5.this,ScoreActivity.class);
        startActivity(i);
    }


    public void onClickngr(View view) {
        Intent i = new Intent(Capital_question5.this,ScoreActivity.class);
        startActivity(i);
    }
    public void back(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
