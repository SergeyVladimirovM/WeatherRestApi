package com.myproject.weatherrestapi.service;

import com.myproject.weatherrestapi.entity.Weather;
import com.myproject.weatherrestapi.repository.WeatherRepository;
import org.springframework.stereotype.Service;

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
}
