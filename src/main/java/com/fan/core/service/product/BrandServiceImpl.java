package com.fan.core.service.product;

import com.fan.core.bean.product.Brand;
import com.fan.core.dao.product.BrandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public List<Brand> getBrandList() {
        List<Brand> brandList = brandDao.getBrandList();
        return brandList;
    }

    @Override
    public List<Brand> getBrandByCondition(Brand brand) {
        List<Brand> brandList = brandDao.getBrandByCondition(brand);
        return brandList;
    }

    @Override
    public List<Brand> getBrandListWithPage(Brand brand) {
        List<Brand> brandList = brandDao.getBrandListWithPage(brand);
        return brandList;
    }

    @Override
    public Integer getBrandCount(Brand brand) {
        Integer brandCount = brandDao.getBrandCount(brand);
        return brandCount;
    }
}
