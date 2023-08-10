package com.myproject.weatherrestapi.POJO.WeatherStackApi;
import java.util.List;

import com.google.gson.annotations.SerializedName;


public class Current {

    @SerializedName("observation_time")
    String observationTime;

    @SerializedName("temperature")
    int temperature;

    @SerializedName("weather_code")
    int weatherCode;

    @SerializedName("weather_icons")
    List<String> weatherIcons;

    @SerializedName("weather_descriptions")
    List<String> weatherDescriptions;

    @SerializedName("wind_speed")
    int windSpeed;

    @SerializedName("wind_degree")
    int windDegree;

    @SerializedName("wind_dir")
    String windDir;

    @SerializedName("pressure")
    int pressure;

    @SerializedName("precip")
    double precip;

    @SerializedName("humidity")
    int humidity;

    @SerializedName("cloudcover")
    int cloudcover;

    @SerializedName("feelslike")
    int feelslike;

    @SerializedName("uv_index")
    int uvIndex;

    @SerializedName("visibility")
    int visibility;

    @SerializedName("is_day")
    String isDay;


    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }
    public String getObservationTime() {
        return observationTime;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setWeatherCode(int weatherCode) {
        this.weatherCode = weatherCode;
    }
    public int getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherIcons(List<String> weatherIcons) {
        this.weatherIcons = weatherIcons;
    }
    public List<String> getWeatherIcons() {
        return weatherIcons;
    }

    public void setWeatherDescriptions(List<String> weatherDescriptions) {
        this.weatherDescriptions = weatherDescriptions;
    }
    public List<String> getWeatherDescriptions() {
        return weatherDescriptions;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }
    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindDegree(int windDegree) {
        this.windDegree = windDegree;
    }
    public int getWindDegree() {
        return windDegree;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }
    public String getWindDir() {
        return windDir;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public int getPressure() {
        return pressure;
    }

    public void setPrecip(double precip) {
        this.precip = precip;
    }
    public double getPrecip() {
        return precip;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public int getHumidity() {
        return humidity;
    }

    public void setCloudcover(int cloudcover) {
        this.cloudcover = cloudcover;
    }
    public int getCloudcover() {
        return cloudcover;
    }

    public void setFeelslike(int feelslike) {
        this.feelslike = feelslike;
    }
    public int getFeelslike() {
        return feelslike;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }
    public int getUvIndex() {
        return uvIndex;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }
    public int getVisibility() {
        return visibility;
    }

    public void setIsDay(String isDay) {
        this.isDay = isDay;
    }
    public String getIsDay() {
        return isDay;
    }

}
