package com.myproject.weatherrestapi.service;

import com.myproject.weatherrestapi.entity.Weather;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

public interface WeatherService {
    Long saveWeather(Weather weather);
    void deleteWeatherById(Long id);
    List<Weather> findAllWeather();
    List<Weather> findAllWeatherByCityAndCountry(String city, String country);
    List<Weather> findAllWeatherByCityAndCountryAnd(String city, String country, OffsetDateTime createdAt);
    Weather weatherByCityWeatherApiCom(String city) throws IOException;
    Weather weatherByCityWeatherStackApi(String city) throws IOException;
    Weather weatherByCityWeatherNinjasApi(String city) throws IOException;
    Long saveWeatherByCity(String city) throws IOException;
}
