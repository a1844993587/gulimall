package com.yualex.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yualex.common.utils.PageUtils;
import com.yualex.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author YuAlex
 * @email 1844993587@qq.com
 * @date 2021-03-20 00:50:52
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

