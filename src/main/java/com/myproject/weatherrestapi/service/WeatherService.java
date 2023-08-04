package com.myproject.weatherrestapi.service;

import com.myproject.weatherrestapi.entity.Weather;

import java.util.List;

public interface WeatherService {
    Long saveWeather(Weather weather);
    void deleteWeatherById(Long id);
    List<Weather> findAllWeather();
}
