package com.example.evaluation_final;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("/posts/{postId}")
    Call<GET> getPost(@Path("postId") int id);
}
