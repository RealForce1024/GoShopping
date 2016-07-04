package com.fan.core.service.product;

import cn.itcast.common.page.Pagination;
import com.fan.core.bean.product.Brand;

import java.util.List;

/**
 * Created by fqc on 2016/7/3.
 */
public interface BrandService {

    void addBrand(Brand brand);

    List<Brand> getBrandList();

    List<Brand> getBrandByCondition(Brand brand);

    Pagination getBrandListWithPage(Brand brand);

    Integer getBrandCount(Brand brand);

}
