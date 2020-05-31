package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FeedbackActivity extends AppCompatActivity {
    private EditText email,name,body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        email = findViewById(R.id.emailForFeedback);
        name = findViewById(R.id.nameForFeedback);
        body = findViewById(R.id.actualFeedback);
    }
    public void openHomeFromFeedback (View view){

        Intent starthomeScreenActivity = new Intent(this,homeScreenActivity.class);
        startActivity(starthomeScreenActivity);
    }

    public void sendFeedback (View view){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/Sferavi%20/json-placeholder/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubApiService service = retrofit.create(GitHubApiService.class);
        Feedback feedback = new Feedback(1,email.getText().toString(),name.getText().toString(),body.getText().toString());
        Call<Feedback> listCall = service.addFeedback(feedback);
        listCall.enqueue(new Callback<Feedback>() {
            @Override
            public void onResponse(Call<Feedback> call, Response<Feedback> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(FeedbackActivity.this,"Feedback has been submited",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(FeedbackActivity.this,FeedbackActivity.class);
                    startActivity(intent);


                } else {

                }
            }

            @Override
            public void onFailure(Call<Feedback> call, Throwable t) {
                t.printStackTrace();
            }


        });



    }
}
