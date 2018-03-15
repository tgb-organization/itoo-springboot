package com.dmsdbj.itoo.facade.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dmsdbj.itoo.entity.TbUser;
import com.dmsdbj.itoo.facade.TbUseFacade;
import com.dmsdbj.itoo.service.TbUseService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TbUseFacadeImpl implements TbUseFacade {

    @Autowired
    TbUseService tbUseService;

    @Override
    public TbUser findOne(long id) {
        return tbUseService.findOne(id);
    }

    @Override
    public int findUserCount() {
        return tbUseService.findUserCount();
    }

}
