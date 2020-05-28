package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmergencyContactsActivity extends AppCompatActivity {

    Button police;
    Button ambulance;
    Button firefighters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contacts);

        police = findViewById(R.id.policeContact);
        ambulance = findViewById(R.id.ambulanceContacts);
        firefighters = findViewById(R.id.firefighterContacts);
    }

    public void policeDial(View view) {
        Intent police = new Intent(Intent.ACTION_DIAL);
        police.setData(Uri.parse("tel:122"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        startActivity(police);

    }
    public void ambulanceDial(View view) {
        Intent ambulance = new Intent(Intent.ACTION_DIAL);
        ambulance.setData(Uri.parse("tel:124"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        startActivity(ambulance);

    }
    public void firefightersDial(View view) {
        Intent firefighters = new Intent(Intent.ACTION_DIAL);
        firefighters.setData(Uri.parse("tel:124"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        startActivity(firefighters);

    }
}
