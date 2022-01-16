package com.ttg.turkeytravelguide.service;

import com.ttg.turkeytravelguide.model.Photo;


import java.util.List;


public interface IPhotoService {

    Photo savePhoto(Photo photo);

    void deletePhoto(Long photoId);

    List<Photo> findAllPhoto();
}
