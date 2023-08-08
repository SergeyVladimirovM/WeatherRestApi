package com.myproject.weatherrestapi.POJO.WeatherStackApi;
import com.google.gson.annotations.SerializedName;


public class Request {

    @SerializedName("type")
    String type;

    @SerializedName("query")
    String query;

    @SerializedName("language")
    String language;

    @SerializedName("unit")
    String unit;


    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    public String getQuery() {
        return query;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getUnit() {
        return unit;
    }

}
