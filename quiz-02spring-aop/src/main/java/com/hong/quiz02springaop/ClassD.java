package com.hong.quiz02springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author: xia liang
 * @create: 2021/01/16 23:23
 */
@Service
public class ClassD {
    @Autowired
    ClassA classA;
    @Cacheable(cacheNames = {"methodE"})
    public String methodE(Integer id){
        String s = classA.methodC(id);
        return s;
    }
}
