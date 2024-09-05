package com.codewithprojects.coupon.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "coupon_consumption_history")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CouponConsumptionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "coupon_id", nullable = false)
    private Coupon coupon;

    @Column(nullable = false)
    private Long customerId;

    @Column(nullable = false)
    private Long orderId;

    @Column(nullable = false)
    private LocalDateTime consumptionDate;
}