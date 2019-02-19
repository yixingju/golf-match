package com.pb.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pb.pojo.Brand;
import com.pb.service.BrandService;
import com.pb.service.RpcBrandService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BrandServiceImpl implements BrandService {
    @Reference(version = "1.0.1")
    RpcBrandService rpcBrandService;

    @Override
    public List<Brand> findByPage() {
        return rpcBrandService.findByPage();
    }
}
