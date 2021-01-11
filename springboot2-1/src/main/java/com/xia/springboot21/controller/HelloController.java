package com.xia.springboot21.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author: xia liang
 * @create: 2021/01/11 16:47
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }
}
