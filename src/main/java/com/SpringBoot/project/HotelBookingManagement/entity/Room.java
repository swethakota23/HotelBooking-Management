package com.SpringBoot.project.HotelBookingManagement.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="hotel_id",nullable=false)
    private Hotel hotel;
    
    @Column(nullable  =false)
    private String type;

    @Column(nullable = false, precision =10,scale=2)
    private BigDecimal basePrice;
    
     @Column(columnDefinition = "TEXT[]")
    private String[] photos;

    @Column(columnDefinition = "TEXT[]")
    private String[] amenities;

    @Column(nullable = false)
    private Integer capacity;

    @Column(nullable = false)
    private Integer totalCount;

    @CreationTimestamp
    @Column(updatable  = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime upDatedAt;


}
