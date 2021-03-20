package com.yualex.gulimall.member.feign;

import com.yualex.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Alex Yu
 * @Time 2021/3/20 14:04
 * @Description com.yualex.gulimall.member.feign
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    R memberCoupons();
}
