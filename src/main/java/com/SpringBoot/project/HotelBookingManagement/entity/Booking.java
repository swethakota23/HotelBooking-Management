package com.SpringBoot.project.HotelBookingManagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Booking {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="hotel_id",nullable=false)
    private Hotel hotel;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="room_id",nullable = false)
    private Room room;

    
}
