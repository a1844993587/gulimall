package com.yualex.gulimall.product.dao;

import com.yualex.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author YuAlex
 * @email 1844993587@qq.com
 * @date 2021-03-20 00:38:59
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
