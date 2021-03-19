package com.yualex.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yualex.common.utils.PageUtils;
import com.yualex.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author YuAlex
 * @email 1844993587@qq.com
 * @date 2021-03-20 01:03:47
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

