package com.dmsdbj.itoo.service.impl;

import com.dmsdbj.itoo.entity.TbUser;
import com.dmsdbj.itoo.dao.TbUseDao;
import com.dmsdbj.itoo.repository.TbUseRepository;
import com.dmsdbj.itoo.service.TbUseService;
import com.dmsdbj.itoo.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbUseServiceImpl implements TbUseService {

    @Autowired
    TbUseRepository repository;

    @Autowired
    TbUseDao tbUseDao;

    private RedisUtils redisUtils;

    @Override
    public TbUser findOne(long id) {
        return repository.findOne(id);
    }

    @Override
    public int findUserCount() {
        return tbUseDao.findUserCount();

    }


}
