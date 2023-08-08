package com.myproject.weatherrestapi.service;

import com.google.gson.Gson;
import com.myproject.weatherrestapi.POJO.WeatherApiCom.WeatherApiComPojo;
import com.myproject.weatherrestapi.POJO.WeatherNinjasApi.WeatherNinjasApiPojo;
import com.myproject.weatherrestapi.POJO.WeatherStackApi.WeatherStackApiPojo;
import com.myproject.weatherrestapi.entity.Weather;
import com.myproject.weatherrestapi.repository.WeatherRepository;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {

    private final WeatherRepository weatherRepository;

    public WeatherServiceImpl(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    @Override
    public Long saveWeather(Weather weather) {
        return weatherRepository.save(weather).getId();
    }

    @Override
    public void deleteWeatherById(Long id) {
        weatherRepository.deleteById(id);
    }

    @Override
    public List<Weather> findAllWeather() {
        return weatherRepository.findAll();
    }

    @Override
    public Long saveWeatherByCityWeatherApiCom(String city) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();

        Request request = new Request.Builder()
                .url("http://api.weatherapi.com/v1/current.json?key=My-Key&q=London&aqi=no")
                .get()
                .build();

        Response response = client.newCall(request).execute();

        WeatherApiComPojo weatherApiComPojo = gson.fromJson(response.body().string(), WeatherApiComPojo.class);
        Weather weather = new Weather();
        weather.setCity(weatherApiComPojo.getLocation().getName());
        weather.setCountry(weatherApiComPojo.getLocation().getCountry());
        weather.setTemperature(weatherApiComPojo.getCurrent().getTempC());
        return saveWeather(weather);
    }

    @Override
    public Long saveWeatherByCityWeatherStackApi(String city) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Gson GSON = new Gson();

        Request request = new Request.Builder()
                .url("http://api.weatherstack.com/current?access_key=My-Key&query=London")
                .get()
                .build();

        Response response = client.newCall(request).execute();
        WeatherStackApiPojo weatherStackApiPojo = GSON.fromJson(response.body().string(), WeatherStackApiPojo.class);
        Weather weather = new Weather();
        weather.setCountry(weatherStackApiPojo.getLocation().getCountry());
        weather.setCity(weatherStackApiPojo.getLocation().getName());
        weather.setTemperature((double) weatherStackApiPojo.getCurrent().getTemperature());
        return saveWeather(weather);
    }

    @Override
    public Long saveWeatherByCityWeatherNinjasApi(String city) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Gson GSON = new Gson();

        Request request = new Request.Builder()
                .url("https://api.api-ninjas.com/v1/weather?city=London")
                .addHeader("X-Api-Key", "My-Key")
                .get()
                .build();

        Response response = client.newCall(request).execute();

        WeatherNinjasApiPojo weatherNinjasApiPojo = GSON.fromJson(response.body().string(), WeatherNinjasApiPojo.class);
        Weather weather = new Weather();
        weather.setCity("London");
        weather.setCountry("United Kingdom");
        weather.setTemperature((double) (weatherNinjasApiPojo.getTemp()));
        return saveWeather(weather);
    }
}
