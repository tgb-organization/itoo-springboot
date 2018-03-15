package com.dmsdbj.itoo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@SuppressWarnings("ALL")
@Component
public class  RedisUtils {

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    //基于字符串的简单属性操作方法
    @Resource(name="stringRedisTemplate")
    ValueOperations<String,String> valOpsStr;

    @Autowired
    RedisTemplate<Object,Object> redisTemplate;
    //基于对象的简单属性操作方法
    @Resource(name = "redisTemplate")
    ValueOperations<Object,Object> valOps;

    public void setStrKey(String key,String value){
        valOpsStr.set(key,value);
    }
    public String getStrKey(String key){
        return valOpsStr.get(key);
    }

    public void setKey(String key,Object object){
        valOps.set(key,object);
    }
    //调用结果需要类型转换
    public Object getObject(String key){
        return valOps.get(key);
    }





}
