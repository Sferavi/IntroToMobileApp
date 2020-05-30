package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListOfNatureSpotsActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_nature_spots);
        listView = findViewById(R.id.naturespotsList);
        getPosts();
    }
    private void getPosts() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/Sferavi%20/json-placeholder/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHubApiService service = retrofit.create(GitHubApiService.class);
        Call<List<Post>> listCall = service.getAllNatureSpots();
        listCall.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if (response.isSuccessful()) {
                    List<Post> natureSpots = response.body();
                    PostListViewAdapter adapter = new PostListViewAdapter(ListOfNatureSpotsActivity.this, natureSpots);
                    listView.setAdapter(adapter);

                } else {

                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                t.printStackTrace();
            }


        });

    }
}
