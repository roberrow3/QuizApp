package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static int score=0;
  public static  String category ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void capitals(View view)
    {
        Intent intent = new Intent(this,Capital_question1.class);
        startActivity(intent);
    }


    public void tOf(View view)
    {
        Intent intent = new Intent(this,TrueFalse_Question1.class);
        startActivity(intent);
    }
    public void english(View view)
    {
        Intent intent = new Intent(this,English_Question1.class);
        startActivity(intent);
    }
    public void bible(View view)
    {
        Intent intent = new Intent(this,Bible_Question1.class);
        startActivity(intent);
    }
    public void gen(View view)
    {
        Intent intent = new Intent(this,General_Question1.class);
        startActivity(intent);
    }




}
