package com.pb.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.pb.pojo.Brand;
import com.pb.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//import com.top.common.RedisUtils;

/**
 * @ClassName RpcBrandServiceImpl
 * @Description TODO
 * @Author 侨居
 * @Date 2019/1/23 15:45
 * @Version 1.0
 */
@Service(version = "1.0.1")
public class RpcBrandServiceImpl implements RpcBrandService {

    @Autowired
    private BrandRepository brandRepository;
//    @Autowired
//    private RedisUtils redisUtils;


    @Override
    public List<Brand> findByPage() {
        return brandRepository.findByPage();
    }
}
