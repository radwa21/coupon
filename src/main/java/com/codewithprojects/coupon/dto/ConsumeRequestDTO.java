package com.codewithprojects.coupon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumeRequestDTO {
    private String code;
    private Long orderId;
    private Long customerId;
}
