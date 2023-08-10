package com.myproject.weatherrestapi.repository;

import com.myproject.weatherrestapi.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.List;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Long> {

    List<Weather> findAllByCityAndCountry(String city, String country);
    List<Weather> findAllByCityAndCountryAndCreatedAt(String city, String country, OffsetDateTime createdAt);
}
