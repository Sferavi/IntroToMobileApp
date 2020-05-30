package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GitHubApiService {

    @GET("posts")
    Call<List<Post>> getAllPosts();

    @GET("restaurants")
    Call<List<Post>> getAllRestaurants();

    @GET("cafes")
    Call<List<Post>> getAllCafes();

    @GET("natureSpots")
    Call<List<Post>> getAllNatureSpots();

    @POST("feedbacks")
    Call<Feedback> addFeedback(@Body Feedback feedback);
}
