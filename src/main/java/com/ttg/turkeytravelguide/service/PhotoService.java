package com.ttg.turkeytravelguide.service;

import com.ttg.turkeytravelguide.model.Photo;


import com.ttg.turkeytravelguide.repository.IPhotoRepository;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class PhotoService implements IPhotoService{

    private final IPhotoRepository photoRepository;

    public PhotoService(IPhotoRepository photoRepository){
        this.photoRepository=photoRepository;
    }


    @Override
    public Photo savePhoto(Photo photo) {
        photo.setDateTime(LocalDateTime.now());
        return photoRepository.save(photo);
    }

    @Override
    public void deletePhoto(Long photoId) {

      photoRepository.deleteById(photoId);
    }


    @Override
    public List<Photo> findAllPhoto() {
       return photoRepository.findAll();
    }




}
