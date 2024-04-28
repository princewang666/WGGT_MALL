package com.wggt.mall_framework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wggt.api.CommonResult;

@RestController
@RequestMapping("/order")
public class OmsOrderController {
    @GetMapping("/list")
    public void list() {}
}
