package com.dmsdbj.itoo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dmsdbj.itoo.facade.TbUseFacade;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/tbuse")
public class TbUseController {

    @Reference
    TbUseFacade tbUseFacade;

    @GetMapping("/test/id/{id}")
    public int test(@PathVariable("id") long id) {

        return tbUseFacade.findUserCount();
    }

}
