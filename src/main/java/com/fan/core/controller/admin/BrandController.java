package com.fan.core.controller.admin;

import com.fan.core.bean.product.Brand;
import com.fan.core.service.product.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by fqc on 2016/7/2.
 * 品牌管理模块
 */
@Controller
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService brandService;
    /*@Autowired
    private BrandService brandService;*/

    /**
     * 品牌列表页
     *
     * @return
     */
    @RequestMapping("list.do")
    public String list(ModelMap modelMap) {
        //后台查询遍历 返回
        List<Brand> brandList = brandService.getBrandList();
        modelMap.addAttribute(brandList);
        return "brand/list";
    }

    /**
     * 品牌列表页
     *
     * @return
     */
    @RequestMapping("getListByCondition.do")
    public String getListByCondition(String name,String isDisplay,ModelMap modelMap) {
        Brand brand = new Brand();
        brand.setName(name);
        brand.setIsDisplay(Integer.parseInt(isDisplay));
        List<Brand> brandList = brandService.getBrandByCondition(brand);
        if (brandList!=null) {//为空则不返回页面自然为空没数据。否则报错
            modelMap.addAttribute(brandList);
        }
        return "brand/list";
    }


    @RequestMapping("toAdd.do")
    public String toAdd() {
        return "brand/add";
    }

    @RequestMapping("add.do")
    public String add(Brand brand) {
        Brand brand2 = new Brand();
        brand2.setName("testxx");
        brand2.setDescription("testxx");
        brand2.setImgUrl("urlxx");
        brand2.setSort(1);
        brand2.setIsDisplay(1);
        brandService.addBrand(brand2);
        return "redirect:brand/list.do";
    }

}
