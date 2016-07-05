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
    private Integer isDisplay = 1; //默认设置为可用

    //*****分页相关的属性******************************************************

    // a. 页号  初始值为1
    private Integer pageNo = 1;

    //1 1*5 2 6*10 3 11*15
    //(2-1)*5+1  (pageNo-1)* pageSize+1
    //开始行  在每次setPageNo 和 setPageSize的时候 都需要重新计算一遍
    private Integer startRow;

    // b. 每页数
    private Integer pageSize = 10;

    // c. 总页数 totalPageSize = getCount()%pageSize
    // 100 5 20  100/5 20 这显然不对 所以应该使用取模运算 count(数据库中所有的条目总数)%size(每页显示的条目数)
    private Integer totalPageSize;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        //计算一次开始行
        this.pageSize = (pageNo - 1) * pageSize + 1;
        this.pageNo = pageNo;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        //计算一次开始行
        this.pageSize = (pageNo - 1) * pageSize + 1;
        this.pageSize = pageSize;
    }

    public Integer getTotalPageSize() {
        return totalPageSize;
    }

    public void setTotalPageSize(Integer totalPageSize) {
        this.totalPageSize = totalPageSize;
    }


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
