package com.fan.core.service.product;

import com.fan.core.bean.product.Brand;
import com.fan.core.dao.product.BrandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by fqc on 2016/7/3.
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandDao brandDao;
    public void addBrand(Brand brand) {
        brandDao.addBrand(brand);
    }
}
