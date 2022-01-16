package com.ttg.turkeytravelguide.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "photo")
public class Photo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "description",length = 1000)
    private String description;

    @Column(name = "photoUrl",length = 3000)
    private String photoUrl;

    @Column(name = "Date",nullable = false)
    private LocalDateTime dateTime;

}
