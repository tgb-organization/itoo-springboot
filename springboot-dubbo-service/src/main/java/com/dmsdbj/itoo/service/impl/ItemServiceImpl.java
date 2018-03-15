package com.dmsdbj.itoo.service.impl;

import com.dmsdbj.itoo.service.*;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService{


    @Override
    public boolean checkItemStatus(String id) {
        if (id.contains("111")) {
            return true;
        } else {
            return false;
        }
    }
}