package com.dmsdbj.itoo.facade;

import com.dmsdbj.itoo.entity.TbUser;

public interface TbUseFacade {

    TbUser findOne(long id);

    int findUserCount();
}
