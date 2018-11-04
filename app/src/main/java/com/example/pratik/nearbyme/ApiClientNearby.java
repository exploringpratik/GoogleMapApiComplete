package com.example.pratik.nearbyme;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClientNearby {
    private static final String BASE_URL2 = "https://gist.githubusercontent.com/exploringpratik/66c08094e01ba8cd47e1e00d427d3406/raw/68f699efdab98dda36d4342d0e3055dee6b70ba3/";
    private static Retrofit retrofit = null;

    public static Retrofit getApiClient2() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        if (retrofit == null)
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL2).
                    addConverterFactory(GsonConverterFactory.create(gson)).
                    build();
        return retrofit;
    }
}
