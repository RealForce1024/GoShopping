package com.fan.core.bean.product;

import com.fan.core.web.Constants;

/**
 * Created by fqc on 2016/7/3.
 * 品牌
 */

public class Brand {

    private Integer id;
    private String name;
    private String description;
    private String imgUrl;
    private Integer sort;
    private Integer isDisplay;

    //*****分页相关的属性******************************************************
    private Integer pageNo; // 页码
    //1 1*5 2 6*10 3 11*15
    //(2-1)*5+1  (pageNo-1)* pageSize+1
    private Integer startNum; //起始条目

    private Integer pageSize = 5;

    //总页数
    // 100 5 20  100/5 20 这显然不对 所以应该使用取模运算 count(数据库中所有的条目总数)%size(每页显示的条目数)
    private Integer totalPageSize;


    //**********************************************************************

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public Integer getSort() {
        return sort;
    }
    public void setSort(Integer sort) {
        this.sort = sort;
    }
    public Integer getIsDisplay() {
        return isDisplay;
    }
    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
    }


    @Override
    public String toString() {
        return "Brand [id=" + id + ", name=" + name + ", description="
                + description + ", imgUrl=" + imgUrl + ", sort=" + sort
                + ", isDisplay=" + isDisplay + "]";
    }


}
