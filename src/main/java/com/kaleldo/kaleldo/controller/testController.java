package com.kaleldo.kaleldo.controller;

import com.kaleldo.kaleldo.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class testController {

    @Autowired
    private TUserRole tUserRole;

    @Autowired
    private TUser tUser;

    @Autowired
    private TRole tRole;

    @Autowired
    private Circle circle;

    @Resource(name = "kaleldo")
    private TMenu tMenu;

    @RequestMapping("/index")
    public String hello() {

        tUserRole.sayHi();
        tUser.sayHi();
        tRole.sayHi();
        circle.sayHi();
        tMenu.sayHi();
        return "我真帅";
    }
}
