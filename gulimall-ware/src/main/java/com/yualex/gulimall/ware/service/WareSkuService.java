package com.yualex.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yualex.common.utils.PageUtils;
import com.yualex.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author YuAlex
 * @email 1844993587@qq.com
 * @date 2021-03-20 01:07:26
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

