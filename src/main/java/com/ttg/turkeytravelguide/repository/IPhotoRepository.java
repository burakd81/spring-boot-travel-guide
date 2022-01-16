package com.ttg.turkeytravelguide.repository;

import com.ttg.turkeytravelguide.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhotoRepository extends JpaRepository<Photo,Long> {
    void deleteById(Photo byId);
}
