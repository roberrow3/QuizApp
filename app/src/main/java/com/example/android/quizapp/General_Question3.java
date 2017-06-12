package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class General_Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general__question3);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(General_Question3.this,MainActivity.class);
        startActivity(intent);
    }

    public void onClickla(View view) {
        Intent i = new Intent(General_Question3.this,General_Question4.class);
        startActivity(i);






        next( );




    }


    public void onClicknyk(View view) {
        Intent i = new Intent(General_Question3.this,General_Question4.class);
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
        Intent intent = new Intent(this,General_Question4.class);
        startActivity(intent);
    }

    private void updateScore(int point){

    }
}
