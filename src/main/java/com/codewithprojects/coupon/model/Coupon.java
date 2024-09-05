package com.codewithprojects.coupon.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
@CrossOrigin(origins = "http://localhost:4200")
@Entity
@Table(name = "coupon")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String code;

    private Integer usageCount = 0;

    @Column(nullable = false)
    private Integer maxUsages;

    @Column(nullable = false)
    private LocalDate expiryDate;

    private double value;

    private String value_type;
}
