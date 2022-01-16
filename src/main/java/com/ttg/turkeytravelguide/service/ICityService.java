package com.ttg.turkeytravelguide.service;

import com.ttg.turkeytravelguide.model.City;

import java.util.List;

public interface ICityService {

    City saveCity(City city);

    void deleteCity(Long id);

    List<City> findAllCity();
}