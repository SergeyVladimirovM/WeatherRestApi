package com.myproject.weatherrestapi.controller;

import com.myproject.weatherrestapi.entity.Weather;
import com.myproject.weatherrestapi.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController("api/v1/weather")
@RequestMapping("/api/v1/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city},{country}")
    public List<Weather> getAllWeatherByCityAndCountry(
            @PathVariable("city") String city,
            @PathVariable("country") String country
    ) {
        return weatherService.findAllWeatherByCityAndCountry(city, country);
    }

    @GetMapping("/request/{city}")
    public Long RequestToTheWeatherApi (@PathVariable("city") String city) throws IOException {
        return weatherService.saveWeatherByCity(city);
    }
}
