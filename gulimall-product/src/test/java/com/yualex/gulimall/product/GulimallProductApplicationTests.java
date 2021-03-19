package com.yualex.gulimall.product;

import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.yualex.gulimall.product.entity.BrandEntity;
import com.yualex.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(6l);
        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        brandService.updateById(brandEntity);
        QueryChainWrapper<BrandEntity> query = brandService.query();
        System.out.println("保存成功!");
    }

}
