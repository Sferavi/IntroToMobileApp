package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static String nameAndSurname;
    private EditText nameOfPerson;
    private EditText surnameOfPerson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameOfPerson = findViewById(R.id.namePerson);
        surnameOfPerson = findViewById(R.id.surnamePerson);

    }
    public void openHomeScreen (View view) {
        nameAndSurname = nameOfPerson.getText().toString()+" "+surnameOfPerson.getText().toString();

        Intent startHomeScreen = new Intent(this,homeScreenActivity.class);
        startActivity(startHomeScreen);
    }
}
