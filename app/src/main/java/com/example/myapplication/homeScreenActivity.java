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

        Intent startlocationsSarajevoActivity = new Intent(this,locationsSarajevoActivity.class);
        startActivity(startlocationsSarajevoActivity);
    }
    public void openFeedback (View view){

        Intent startFeedbackActivity = new Intent(this,FeedbackActivity.class);
        startActivity(startFeedbackActivity);
    }

    public void openEmergencyContacts (View view){

        Intent startEmergencyContactsActivity = new Intent(this,EmergencyContactsActivity.class);
        startActivity(startEmergencyContactsActivity);
    }
}
