package com.example.covid_19dash;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

    public static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        if (retrofit==null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl("https://www.hpb.health.gov.lk/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
