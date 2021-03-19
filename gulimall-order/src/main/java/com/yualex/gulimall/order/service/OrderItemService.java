package com.yualex.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yualex.common.utils.PageUtils;
import com.yualex.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author YuAlex
 * @email 1844993587@qq.com
 * @date 2021-03-20 01:03:46
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

