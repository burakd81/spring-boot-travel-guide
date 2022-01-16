package com.ttg.turkeytravelguide.repository;

import com.ttg.turkeytravelguide.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICityRepository extends JpaRepository<City,Long> {
    void deleteById(City byId);
}
