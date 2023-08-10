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
import java.time.OffsetDateTime;
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
    public List<Weather> findAllWeatherByCityAndCountry(String city, String country) {
        return weatherRepository.findAllByCityAndCountry(city, country);
    }

    @Override
    public List<Weather> findAllWeatherByCityAndCountryAnd(String city, String country, OffsetDateTime createdAt) {
        return null;
    }

    @Override
    public Weather weatherByCityWeatherApiCom(String city) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Gson gson = new Gson();

        Request request = new Request.Builder()
                .url(String.format("http://api.weatherapi.com/v1/current.json?key=My-Key&q=%s&aqi=no", city))
                .get()
                .build();

        Response response = client.newCall(request).execute();

        WeatherApiComPojo weatherApiComPojo = gson.fromJson(response.body().string(), WeatherApiComPojo.class);
        Weather weather = new Weather();
        weather.setCity(weatherApiComPojo.getLocation().getName());
        weather.setCountry(weatherApiComPojo.getLocation().getCountry());
        weather.setTemperature((int) weatherApiComPojo.getCurrent().getTempC());
        return weather;
    }

    @Override
    public Weather weatherByCityWeatherStackApi(String city) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Gson GSON = new Gson();

        Request request = new Request.Builder()
                .url(String.format("http://api.weatherstack.com/current?access_key=My-Key&query=%s", city))
                .get()
                .build();

        Response response = client.newCall(request).execute();
        WeatherStackApiPojo weatherStackApiPojo = GSON.fromJson(response.body().string(), WeatherStackApiPojo.class);
        Weather weather = new Weather();
        weather.setCountry(weatherStackApiPojo.getLocation().getCountry());
        weather.setCity(weatherStackApiPojo.getLocation().getName());
        weather.setTemperature(weatherStackApiPojo.getCurrent().getTemperature());
        return weather;
    }

    @Override
    public Weather weatherByCityWeatherNinjasApi(String city) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Gson GSON = new Gson();

        Request request = new Request.Builder()
                .url(String.format("https://api.api-ninjas.com/v1/weather?city=%s", city))
                .addHeader("X-Api-Key", "My-Key")
                .get()
                .build();

        Response response = client.newCall(request).execute();

        WeatherNinjasApiPojo weatherNinjasApiPojo = GSON.fromJson(response.body().string(), WeatherNinjasApiPojo.class);
        Weather weather = new Weather();
        weather.setCity("London");
        weather.setCountry("United Kingdom");
        weather.setTemperature(weatherNinjasApiPojo.getTemp());
        return weather;
    }

    @Override
    public Long saveWeatherByCity(String city) throws IOException {
        Weather weatherApiCom = weatherByCityWeatherApiCom(city);
        Weather weatherStackApi = weatherByCityWeatherStackApi(city);
        Weather weatherNinjasApi = weatherByCityWeatherNinjasApi(city);

        Integer medTemp = (weatherApiCom.getTemperature() + weatherStackApi.getTemperature() + weatherNinjasApi.getTemperature()) / 3;
        Weather weather = weatherApiCom;
        weather.setTemperature(medTemp);
        return saveWeather(weather);
    }
}
