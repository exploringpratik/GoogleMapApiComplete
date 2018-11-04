package com.example.pratik.nearbyme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.pratik.nearbyme.mapAPI.MapDetails;
import com.example.pratik.nearbyme.mapAPI.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.internal.PolylineEncoding;
import com.google.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    List<NearbyMe> nearbyMeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadJSONforNearby("GoogleMap");
    }


    private void loadJSONforNearby(final String category) {

        try {
            ApiInterfaceNearby apiInterfaceNearby = ApiClientNearby.getApiClient2().create(ApiInterfaceNearby.class);
            Call<MapDetails> call = apiInterfaceNearby.getPlaceLists(category);
            call.enqueue(new Callback<MapDetails>() {
                @Override
                public void onResponse(Call<MapDetails> call, Response<MapDetails> response) {
                    generateDataforNearby(response.body(), category);

                }

                @Override
                public void onFailure(Call<MapDetails> call, Throwable t) {
                    // JsonReader.setLenient(true);
                    Log.d("Error", t.getMessage());
                    Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_SHORT).show();
                    //      Toast.makeText(HomeActivity.this, "Error Fetching Data!   ", Toast.LENGTH_LONG).show();

                }
            });

        } catch (Exception e) {
            Log.d("Error", e.getMessage());
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    private void generateDataforNearby(MapDetails nearbyList, String category) {
        String distance = String.valueOf(nearbyList.getRoutes().get(0).getLegs().get(0).getDistance().getText());
        String time = String.valueOf(nearbyList.getRoutes().get(0).getLegs().get(0).getDuration().getText());
        String overViewPolyline = String.valueOf(nearbyList.getRoutes().get(0).getOverviewPolyline().getPoints());

        List<LatLng> decoded = PolylineEncoding.decode(overViewPolyline);

      //  Polyline mpolyline =

    }

}


