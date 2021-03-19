package com.yualex.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yualex.common.utils.PageUtils;
import com.yualex.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author YuAlex
 * @email 1844993587@qq.com
 * @date 2021-03-20 00:57:07
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

