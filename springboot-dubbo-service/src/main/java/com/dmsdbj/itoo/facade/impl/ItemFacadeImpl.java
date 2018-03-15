package com.dmsdbj.itoo.facade.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dmsdbj.itoo.facade.ItemFacade;
import com.dmsdbj.itoo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ItemFacadeImpl implements ItemFacade {

    @Override
    public boolean checkItemStatus(String id) {
        if (id.contains("111")) {
            return true;
        } else {
            return false;
        }
    }
}
