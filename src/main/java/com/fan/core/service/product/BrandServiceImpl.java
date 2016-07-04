package com.fan.core.service.product;

import cn.itcast.common.page.Pagination;
import com.fan.core.bean.product.Brand;
import com.fan.core.dao.product.BrandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by fqc on 2016/7/3.
 */
@Service
@Transactional
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
    @Transactional(readOnly = true)
    public Pagination getBrandListWithPage(Brand brand) {
        //分页对象
        //1.起始行 startRow
        //2.每页数
        //3.总页数
        Pagination pagination = new Pagination((brand.getPageNo()-1)*5,5,brandDao.getBrandCount(brand));
        List<Brand> brandList = brandDao.getBrandListWithPage(brand);
        pagination.setList(brandList);
        return pagination;
    }

    @Override
    public Integer getBrandCount(Brand brand) {
        Integer brandCount = brandDao.getBrandCount(brand);
        return brandCount;
    }
}
