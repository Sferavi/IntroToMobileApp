package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class locationsSarajevoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations_sarajevo);
    }


    public void openLocationsSarajevo (View view){

        Intent startListOfMonumentsActivity = new Intent(this,ListOfMonumentsActivity.class);
        startActivity(startListOfMonumentsActivity);
    }
}
