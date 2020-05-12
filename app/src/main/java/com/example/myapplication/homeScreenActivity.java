package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }
    public void openLocationsSarajevo (View view){

        Intent startLocationsSarajevo = new Intent(this,locationsSarajevoActivity.class);
        startActivity(startLocationsSarajevo);
    }
}
