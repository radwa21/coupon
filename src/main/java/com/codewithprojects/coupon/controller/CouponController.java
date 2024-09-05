package com.codewithprojects.coupon.controller;

import com.codewithprojects.coupon.dto.ConsumeRequestDTO;
import com.codewithprojects.coupon.dto.CouponDTO;
import com.codewithprojects.coupon.dto.CouponConsumptionHistoryDTO;
import com.codewithprojects.coupon.dto.CouponValidationResponseDTO;
import com.codewithprojects.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coupons")
@CrossOrigin(origins = "http://localhost:4200")
public class CouponController {

    @Autowired
    private CouponService couponService;
    @PostMapping("/add")
    @CrossOrigin(origins = "http://localhost:4200")
    public CouponDTO addCoupon(@RequestBody CouponDTO couponDTO) {
        return couponService.addCoupon(couponDTO);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete/{id}")
    public void deleteCoupon(@PathVariable Long id) {
        couponService.deleteCoupon(id);
    }

    @DeleteMapping("/deleteByCode/{code}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void deleteCouponByCode(@PathVariable String code) {
        couponService.deleteCouponByCode(code);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public List<CouponDTO> getAllCoupons() {
        return couponService.getAllCoupons();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/history")
    public List<CouponConsumptionHistoryDTO> getCouponHistory() {
        return couponService.getCouponHistory();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/validate/{code}")
    public CouponValidationResponseDTO validateCoupon(@PathVariable String code) {
        return couponService.validateCoupon(code);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/consume")
    public boolean consumeCoupon(@RequestBody ConsumeRequestDTO consumeRequestDTO) {
        return couponService.consumeCoupon(consumeRequestDTO);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{code}")
    public CouponDTO getCoupon(@PathVariable String code) {
        return couponService.getCouponByCode(code);
    }
}
