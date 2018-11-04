package com.example.pratik.nearbyme;

public class NearbyMe {
    private String placeName, placeURL, placeID, distance,time,longitude,latitude;

    public NearbyMe(String placeName, String placeURL, String placeID, String distance, String time, String longitude, String latitude) {
        this.placeName = placeName;
        this.placeURL = placeURL;
        this.placeID = placeID;
        this.distance = distance;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceURL() {
        return placeURL;
    }

    public void setPlaceURL(String placeURL) {
        this.placeURL = placeURL;
    }

    public String getPlaceID() {
        return placeID;
    }

    public void setPlaceID(String placeID) {
        this.placeID = placeID;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getKm() {
        return time;
    }

    public void setKm(String time) {
        this.time = time;
    }
}
