package com.fan.core.dao.product;

import com.fan.core.bean.product.Brand;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by fqc on 2016/7/3.
 * 品牌DAO
 */

public interface BrandDao {

    void addBrand(Brand brand);

    List<Brand> getBrandList();

    List<Brand> getBrandByCondition(Brand brand);

    List<Brand> getBrandListWithPage(Brand brand);

    Integer getBrandCount(Brand brand);

}
