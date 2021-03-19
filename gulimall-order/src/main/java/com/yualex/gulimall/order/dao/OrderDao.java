package com.yualex.gulimall.order.dao;

import com.yualex.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author YuAlex
 * @email 1844993587@qq.com
 * @date 2021-03-20 01:03:47
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
