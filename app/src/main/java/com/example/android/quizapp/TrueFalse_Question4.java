package com.example.android.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TrueFalse_Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_false__question4);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(TrueFalse_Question4.this,MainActivity.class);
        startActivity(intent);
    }
    public void onClicktru(View view) {
        Intent i = new Intent(TrueFalse_Question4.this,TrueFalse_Question5.class);
        startActivity(i);






        next( );

        MainActivity.score=MainActivity.score +1;




    }


    public void onClickfls(View view) {
        Intent i = new Intent(TrueFalse_Question4.this,TrueFalse_Question5.class);
        startActivity(i);






        next( );
    }

    public void back(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


    public void next() {
        Intent intent = new Intent(this, TrueFalse_Question5.class);
        startActivity(intent);

    }
}
