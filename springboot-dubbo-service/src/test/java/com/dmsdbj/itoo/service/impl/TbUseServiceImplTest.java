package com.dmsdbj.itoo.service.impl;

import com.dmsdbj.itoo.entity.TbUser;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.JedisCluster;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TbUseServiceImplTest {

    @Reference
    TbUseServiceImpl tbUseService;

    @Test
    public void findOne() {
        TbUser one = tbUseService.findOne(1L);
        Assert.assertEquals("zhangsan",one.getUsername());
    }

    @Autowired
    private JedisCluster jedisCluster;

    @Test
    public void test() throws Exception {

        jedisCluster.set("userName", "hello wenqy");
        String userName = jedisCluster.get("userName");
        System.out.println(userName);
//        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));

    }

}