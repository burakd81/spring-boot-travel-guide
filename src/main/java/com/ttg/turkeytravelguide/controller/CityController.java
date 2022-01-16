package com.ttg.turkeytravelguide.controller;

import com.ttg.turkeytravelguide.model.City;
import com.ttg.turkeytravelguide.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/city")
public class CityController {

    @Autowired
    private ICityService cityService;

    @PostMapping
    public ResponseEntity<?> saveCity(@RequestBody City city)
    {
        return new ResponseEntity<>(cityService.saveCity(city), HttpStatus.CREATED);
    }

    @DeleteMapping("{cityId}")
    public ResponseEntity<?> deleteCity(@PathVariable Long cityId){
        cityService.deleteCity(cityId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllCity() {return new ResponseEntity<>(cityService.findAllCity(),HttpStatus.OK);}
}
