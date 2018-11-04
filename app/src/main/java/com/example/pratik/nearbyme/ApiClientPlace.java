//package com.example.pratik.nearbyme;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//public class ApiClientPlace {
//    private static final String BASE_URL2 = "https://ghumau.herokuapp.com/api/";
//    private static Retrofit retrofit = null;
//
//    public static Retrofit getApiClient2() {
//        Gson gson = new GsonBuilder()
//                .setLenient()
//                .create();
//        if (retrofit == null)
//            retrofit = new Retrofit.Builder().baseUrl(BASE_URL2).
//                    addConverterFactory(GsonConverterFactory.create(gson)).
//                    build();
//        return retrofit;
//    }
//}
