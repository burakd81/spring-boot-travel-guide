package com.ttg.turkeytravelguide.service;

import com.ttg.turkeytravelguide.model.City;
import com.ttg.turkeytravelguide.repository.ICityRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CityService implements ICityService{

    private final ICityRepository cityRepository;

    public CityService(ICityRepository cityRepository){
        this.cityRepository=cityRepository;
    }

    @Override
    public City saveCity(City city) {
        city.setCreateTime(LocalDateTime.now());
        return cityRepository.save(city);
    }

    @Override
    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public List<City> findAllCity() {
        return cityRepository.findAll();
    }
}