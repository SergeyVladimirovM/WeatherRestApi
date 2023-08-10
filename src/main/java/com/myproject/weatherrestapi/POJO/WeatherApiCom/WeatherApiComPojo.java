package com.myproject.weatherrestapi.POJO.WeatherApiCom;

import com.google.gson.annotations.SerializedName;


public class WeatherApiComPojo {

    @SerializedName("location")
    Location location;

    @SerializedName("current")
    Current current;


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
