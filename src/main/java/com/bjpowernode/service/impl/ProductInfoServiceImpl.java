//2021/10/6
package com.bjpowernode.service.impl;

import com.bjpowernode.mapper.ProductInfoMapper;
import com.bjpowernode.pojo.ProductInfo;
import com.bjpowernode.pojo.ProductInfoExample;
import com.bjpowernode.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> getAll() {


        return productInfoMapper.selectByExample(new ProductInfoExample());
    }
}

