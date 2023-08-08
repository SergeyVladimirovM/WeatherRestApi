package com.myproject.weatherrestapi.POJO.WeatherStackApi;
import com.google.gson.annotations.SerializedName;


public class Location {

    @SerializedName("name")
    String name;

    @SerializedName("country")
    String country;

    @SerializedName("region")
    String region;

    @SerializedName("lat")
    String lat;

    @SerializedName("lon")
    String lon;

    @SerializedName("timezone_id")
    String timezoneId;

    @SerializedName("localtime")
    String localtime;

    @SerializedName("localtime_epoch")
    int localtimeEpoch;

    @SerializedName("utc_offset")
    String utcOffset;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    public String getRegion() {
        return region;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
    public String getLat() {
        return lat;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }
    public String getLon() {
        return lon;
    }

    public void setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
    }
    public String getTimezoneId() {
        return timezoneId;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }
    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltimeEpoch(int localtimeEpoch) {
        this.localtimeEpoch = localtimeEpoch;
    }
    public int getLocaltimeEpoch() {
        return localtimeEpoch;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }
    public String getUtcOffset() {
        return utcOffset;
    }

}
