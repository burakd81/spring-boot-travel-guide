package com.ttg.turkeytravelguide.controller;

import com.ttg.turkeytravelguide.model.Photo;
import com.ttg.turkeytravelguide.service.IPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/photo")
public class PhotoController {

    @Autowired
    private IPhotoService photoService;


    @PostMapping
    public ResponseEntity<?> savePhoto(@RequestBody Photo photo){

        return new ResponseEntity<>(photoService.savePhoto(photo),HttpStatus.CREATED);
    }

    @DeleteMapping("{photoId}")
    public ResponseEntity<?> deletePhoto(@PathVariable Long photoId){
        photoService.deletePhoto(photoId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllPhoto(){
        return new ResponseEntity<>(photoService.findAllPhoto(),HttpStatus.OK);
    }


}
