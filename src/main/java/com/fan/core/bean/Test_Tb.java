package com.fan.core.bean;

import java.util.Date;

/**
 * Created by fqc on 2016/6/29.
 */
public class Test_Tb {


    private Integer id;
    private String name;
    private Date birthday;

    public Test_Tb() {

    }

    public Test_Tb( String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
