package com.fan.core.web;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by fqc on 2016/6/30.
 */
public class CustomDateConvetor implements WebBindingInitializer{

    public void initBinder(WebDataBinder binder, WebRequest request) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class,new CustomDateEditor(simpleDateFormat,true));
    }
}
