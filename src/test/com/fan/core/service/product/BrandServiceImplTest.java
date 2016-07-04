package com.fan.core.service.product;

import com.fan.common.junit.SpringJunitTest;
import com.fan.core.bean.product.Brand;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by fqc on 2016/7/3.
 */
public class BrandServiceImplTest extends SpringJunitTest {
    @Autowired
    private BrandService brandService;

    @Test
    public void getBrandByCondition() throws Exception {
        Brand brand = new Brand();
        brand.setName("test");
        brand.setIsDisplay(1);
        List<Brand> brandList = brandService.getBrandByCondition(brand);
        System.out.println(brandList);
    }

    @Test
    public void getBrandList() throws Exception {
        List<Brand> brandList = brandService.getBrandList();
        System.out.println(brandList);
    }


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