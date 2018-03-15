package com.dmsdbj.itoo.service;

import com.dmsdbj.itoo.entity.TbUser;

public interface TbUseService {

    TbUser findOne(long id);

    int findUserCount();
}
