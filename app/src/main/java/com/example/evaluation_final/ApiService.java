package com.example.evaluation_final;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("/GET/{get}")
    Call<GET> get(@Path("get") int id);
}
