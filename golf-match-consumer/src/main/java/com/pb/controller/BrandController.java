package com.pb.controller;

import com.pb.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BrandController
 * @Description TODO
 * @Author 侨居
 * @Date 2019/1/23 16:02
 * @Version 1.0
 */
@RestController
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/list")
    public String list(){
        return brandService.findByPage().toString();
    }
}
