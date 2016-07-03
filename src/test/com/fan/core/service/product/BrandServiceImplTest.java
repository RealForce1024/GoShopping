package com.fan.core.service.product;

import com.fan.common.junit.SpringJunitTest;
import com.fan.core.bean.product.Brand;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.junit.Assert.*;

/**
 * Created by fqc on 2016/7/3.
 */
public class BrandServiceImplTest extends SpringJunitTest {
    @Autowired
    private BrandService brandService;
    @Test
    public void addBrand() throws Exception {
        Brand brand = new Brand();
        brand.setName("test");
        brand.setDescription("test");
        brand.setImgUrl("url");
        brand.setSort(1);
        brand.setIsDisplay(0);
        brandService.addBrand(brand);

    }

}