package com.yualex.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yualex.common.utils.PageUtils;
import com.yualex.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author YuAlex
 * @email 1844993587@qq.com
 * @date 2021-03-20 00:38:59
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

