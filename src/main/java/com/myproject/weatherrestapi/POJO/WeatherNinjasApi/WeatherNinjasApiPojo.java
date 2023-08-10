package com.myproject.weatherrestapi.POJO.WeatherNinjasApi;

import com.google.gson.annotations.SerializedName;


public class WeatherNinjasApiPojo {

    @SerializedName("cloud_pct")
    int cloudPct;

    @SerializedName("temp")
    int temp;

    @SerializedName("feels_like")
    int feelsLike;

    @SerializedName("humidity")
    int humidity;

    @SerializedName("min_temp")
    int minTemp;

    @SerializedName("max_temp")
    int maxTemp;

    @SerializedName("wind_speed")
    double windSpeed;

    @SerializedName("wind_degrees")
    int windDegrees;

    @SerializedName("sunrise")
    int sunrise;

    @SerializedName("sunset")
    int sunset;


    public void setCloudPct(int cloudPct) {
        this.cloudPct = cloudPct;
    }
    public int getCloudPct() {
        return cloudPct;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    public int getTemp() {
        return temp;
    }

    public void setFeelsLike(int feelsLike) {
        this.feelsLike = feelsLike;
    }
    public int getFeelsLike() {
        return feelsLike;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public int getHumidity() {
        return humidity;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }
    public int getMinTemp() {
        return minTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }
    public int getMaxTemp() {
        return maxTemp;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }
    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindDegrees(int windDegrees) {
        this.windDegrees = windDegrees;
    }
    public int getWindDegrees() {
        return windDegrees;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }
    public int getSunrise() {
        return sunrise;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }
    public int getSunset() {
        return sunset;
    }

}
