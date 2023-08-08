package com.myproject.weatherrestapi.service;

import com.myproject.weatherrestapi.entity.Weather;

import java.io.IOException;
import java.util.List;

public interface WeatherService {
    Long saveWeather(Weather weather);
    void deleteWeatherById(Long id);
    List<Weather> findAllWeather();
    Long saveWeatherByCityWeatherApiCom(String city) throws IOException;
    Long saveWeatherByCityWeatherStackApi(String city) throws IOException;
    Long saveWeatherByCityWeatherNinjasApi(String city) throws IOException;
}
