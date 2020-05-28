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


    public void openMonuments (View view){

        Intent startListOfMonumentsActivity = new Intent(this,ListOfMonumentsActivity.class);
        startActivity(startListOfMonumentsActivity);
    }
    public void openRestaurants (View view){

        Intent startListOfRestaurantsActivity = new Intent(this,ListOfRestaurantsActivity.class);
        startActivity(startListOfRestaurantsActivity);
    }
    public void openCafes (View view){

        Intent startListOfCafesActivity = new Intent(this,ListOfCafesActivity.class);
        startActivity(startListOfCafesActivity);
    }
    public void openNatureSpots (View view){

        Intent startListOfNatureSpotsActivity = new Intent(this,ListOfNatureSpotsActivity.class);
        startActivity(startListOfNatureSpotsActivity);
    }
}
