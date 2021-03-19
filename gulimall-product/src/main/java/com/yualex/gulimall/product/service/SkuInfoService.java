package com.yualex.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yualex.common.utils.PageUtils;
import com.yualex.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author YuAlex
 * @email 1844993587@qq.com
 * @date 2021-03-20 00:38:58
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

