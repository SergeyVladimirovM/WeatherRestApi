package com.myproject.weatherrestapi.POJO.WeatherStackApi;
import com.google.gson.annotations.SerializedName;


public class WeatherStackApiPojo {

    @SerializedName("request")
    Request request;

    @SerializedName("location")
    Location location;

    @SerializedName("current")
    Current current;


    public void setRequest(Request request) {
        this.request = request;
    }
    public Request getRequest() {
        return request;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    public Location getLocation() {
        return location;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
    public Current getCurrent() {
        return current;
    }

}
