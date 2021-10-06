//2021/10/6
package com.bjpowernode.controller;


import com.bjpowernode.pojo.ProductInfo;
import com.bjpowernode.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/prod")
public class ProductInfoAction {
//    显示全部商品不分页

    @Autowired
    ProductInfoService productInfoService;

    @RequestMapping("/getAll")
    public String getAll(HttpServletRequest request){
        List<ProductInfo> list = productInfoService.getAll();
        request.setAttribute("","");
        return "pord";


    }
}

