package com.dmsdbj.itoo.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface TbUseDao {
    int findUserCount();
}
