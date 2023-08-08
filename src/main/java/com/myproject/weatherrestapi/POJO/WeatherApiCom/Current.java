package com.myproject.weatherrestapi.POJO.WeatherApiCom;

import com.google.gson.annotations.SerializedName;

public class Current {

    @SerializedName("last_updated_epoch")
    double lastUpdatedEpoch;

    @SerializedName("last_updated")
    String lastUpdated;

    @SerializedName("temp_c")
    double tempC;

    @SerializedName("temp_f")
    double tempF;

    @SerializedName("is_day")
    double isDay;

    @SerializedName("condition")
    Condition condition;

    @SerializedName("wind_mph")
    double windMph;

    @SerializedName("wind_kph")
    double windKph;

    @SerializedName("wind_degree")
    double windDegree;

    @SerializedName("wind_dir")
    String windDir;

    @SerializedName("pressure_mb")
    double pressureMb;

    @SerializedName("pressure_in")
    double pressureIn;

    @SerializedName("precip_mm")
    double precipMm;

    @SerializedName("precip_in")
    double precipIn;

    @SerializedName("humidity")
    double humidity;

    @SerializedName("cloud")
    double cloud;

    @SerializedName("feelslike_c")
    double feelslikeC;

    @SerializedName("feelslike_f")
    double feelslikeF;

    @SerializedName("vis_km")
    double visKm;

    @SerializedName("vis_miles")
    double visMiles;

    @SerializedName("uv")
    double uv;

    @SerializedName("gust_mph")
    double gustMph;

    @SerializedName("gust_kph")
    double gustKph;


    public void setLastUpdatedEpoch(double lastUpdatedEpoch) {
        this.lastUpdatedEpoch = lastUpdatedEpoch;
    }
    public double getLastUpdatedEpoch() {
        return lastUpdatedEpoch;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setTempC(double tempC) {
        this.tempC = tempC;
    }
    public double getTempC() {
        return tempC;
    }

    public void setTempF(double tempF) {
        this.tempF = tempF;
    }
    public double getTempF() {
        return tempF;
    }

    public void setIsDay(double isDay) {
        this.isDay = isDay;
    }
    public double getIsDay() {
        return isDay;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
    public Condition getCondition() {
        return condition;
    }

    public void setWindMph(double windMph) {
        this.windMph = windMph;
    }
    public double getWindMph() {
        return windMph;
    }

    public void setWindKph(double windKph) {
        this.windKph = windKph;
    }
    public double getWindKph() {
        return windKph;
    }

    public void setWindDegree(double windDegree) {
        this.windDegree = windDegree;
    }
    public double getWindDegree() {
        return windDegree;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }
    public String getWindDir() {
        return windDir;
    }

    public void setPressureMb(double pressureMb) {
        this.pressureMb = pressureMb;
    }
    public double getPressureMb() {
        return pressureMb;
    }

    public void setPressureIn(double pressureIn) {
        this.pressureIn = pressureIn;
    }
    public double getPressureIn() {
        return pressureIn;
    }

    public void setPrecipMm(double precipMm) {
        this.precipMm = precipMm;
    }
    public double getPrecipMm() {
        return precipMm;
    }

    public void setPrecipIn(double precipIn) {
        this.precipIn = precipIn;
    }
    public double getPrecipIn() {
        return precipIn;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
    public double getHumidity() {
        return humidity;
    }

    public void setCloud(double cloud) {
        this.cloud = cloud;
    }
    public double getCloud() {
        return cloud;
    }

    public void setFeelslikeC(double feelslikeC) {
        this.feelslikeC = feelslikeC;
    }
    public double getFeelslikeC() {
        return feelslikeC;
    }

    public void setFeelslikeF(double feelslikeF) {
        this.feelslikeF = feelslikeF;
    }
    public double getFeelslikeF() {
        return feelslikeF;
    }

    public void setVisKm(double visKm) {
        this.visKm = visKm;
    }
    public double getVisKm() {
        return visKm;
    }

    public void setVisMiles(double visMiles) {
        this.visMiles = visMiles;
    }
    public double getVisMiles() {
        return visMiles;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }
    public double getUv() {
        return uv;
    }

    public void setGustMph(double gustMph) {
        this.gustMph = gustMph;
    }
    public double getGustMph() {
        return gustMph;
    }

    public void setGustKph(double gustKph) {
        this.gustKph = gustKph;
    }
    public double getGustKph() {
        return gustKph;
    }

}