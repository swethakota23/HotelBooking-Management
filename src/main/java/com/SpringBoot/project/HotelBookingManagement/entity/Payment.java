package com.SpringBoot.project.HotelBookingManagement.entity;
import java.math.BigDecimal;

import com.SpringBoot.project.HotelBookingManagement.entity.enums.PaymentStatus;

import jakarta.persistence.*;



import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,nullable = false)
    private String transactionId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentStatus paymentStatus;

    @Column(nullable = false, precision = 10,scale=2)
    private BigDecimal amount;

}
