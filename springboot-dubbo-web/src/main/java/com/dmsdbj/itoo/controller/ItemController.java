package com.dmsdbj.itoo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dmsdbj.itoo.facade.ItemFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    //注入服务提供方暴露的接口，通过@Reference注解，dubbo会在扫描的时候自动代理接口，然后通过rpc调用远程服务。
    //如果用xml配置方式，需要将@Reference换成@Autowired。
    @Reference
//    @Autowired
    ItemFacade itemFacade;

    @RequestMapping("/canbuy")
    public String canBuy(@RequestParam("id") String id){
        System.out.println(id);
        boolean flag = itemFacade.checkItemStatus(id);
        if (flag) {
            return "can buy!";
        } else {
            return "can not buy!";
        }
    }

}