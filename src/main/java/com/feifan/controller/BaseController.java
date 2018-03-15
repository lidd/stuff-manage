package com.feifan.controller;

import com.feifan.domain.easyui.EasyPage;
import org.springframework.data.domain.Page;

/**
 * Created by Lidd on 2018/3/10.
 */
public abstract class BaseController {

    protected EasyPage parse(Page p){
        EasyPage page = new EasyPage();
        page.setRows(p.getContent());
        page.setTotal(p.getTotalElements());
        return page;
    }
}
