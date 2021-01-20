package com.hong.quiz02springaop.controller;

import com.hong.quiz02springaop.ClassA;
import com.hong.quiz02springaop.ClassD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xia liang
 * @create: 2021/01/16 22:06
 */
@RestController
public class TestController {
    @Autowired
    ClassA classA;
    @Autowired
    ClassD classD;
    @PostMapping("/test/{id}")
    public String test(@PathVariable("id") Integer id){
        String methodC = classA.methodC(id);
        return methodC;
    }
    @PostMapping("/test2/{id}")
    public String test2(@PathVariable("id") Integer id){
        String methodB = classA.methodB(id);
        return methodB;
    }
    @PostMapping("/testD/{id}")
    public String testD(@PathVariable("id") Integer id){
        String s = classD.methodE(id);
        return s;
    }
}
