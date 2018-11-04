package com.example.pratik.nearbyme;

import com.example.pratik.nearbyme.mapAPI.MapDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterfaceNearby {
    @GET("{GoogleMap}") //Your end point is here
    Call<MapDetails> getPlaceLists(@Path("GoogleMap") String category);
}
