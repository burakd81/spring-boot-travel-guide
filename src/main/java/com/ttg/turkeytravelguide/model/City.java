package com.ttg.turkeytravelguide.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cityName",length = 1000)
    private String cityName;

    @Column(name = "description",length = 1000)
    private String description;

    @Column(name = "photoUrl",nullable = false)
    private String photoUrl;

    @Column(name = "create_time",nullable = false)
    private LocalDateTime createTime;


}
