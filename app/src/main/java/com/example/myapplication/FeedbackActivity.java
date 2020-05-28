package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {
    Button a, b, c, d, e, f, g, h;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        a = (Button) findViewById(R.id.radioButton1);
        b = (Button) findViewById(R.id.radioButton2);
        c = (Button) findViewById(R.id.radioButton3);
        d = (Button) findViewById(R.id.radioButton4);
        e = (Button) findViewById(R.id.radioButton5);
        f = (Button) findViewById(R.id.radioButton6);
        g = (Button) findViewById(R.id.radioButton7);
        h = (Button) findViewById(R.id.feedbackButton);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("mailto:djcobrica@gmail.com"));
                i.putExtra(Intent.EXTRA_SUBJECT, "Feedback from App");
                i.putExtra(Intent.EXTRA_TEXT, "Feedback message : " + e1.getText());
                try {
                    startActivity(Intent.createChooser(i, "Send feedback..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


