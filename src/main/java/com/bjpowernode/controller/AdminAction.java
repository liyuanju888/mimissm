//2021/10/6
package com.bjpowernode.controller;


import com.bjpowernode.pojo.Admin;
import com.bjpowernode.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminAction {
//    在所有的界面层，一定会有业务逻辑层的对象
    @Autowired
    public AdminService adminService;
    //    实现登陆判断，并进行相应的跳转

    @RequestMapping("/login")
    public String login1(String name,String pwd,HttpServletRequest request){

        Admin admin = adminService.login(name, pwd);
        if (admin!=null){
            request.setAttribute("admin",admin);
            return "main";
        }else {
            request.setAttribute("errmsg","错误");
            return "login";
        }

    }
}

