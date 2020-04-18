package com.example.covid_19dash;

import retrofit2.Call;
import retrofit2.http.GET;

public interface jsonPlaceHolderApi {
    @GET("get-current-statistical")
    Call<Dataf> getDaata();
}
