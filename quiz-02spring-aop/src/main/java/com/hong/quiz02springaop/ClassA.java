package com.hong.quiz02springaop;

import com.hong.quiz02springaop.entity.TestCache;
import com.hong.quiz02springaop.mapper.TestCacheMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author: xia liang
 * @create: 2021/01/16 22:00
 */
@Service
public class ClassA {
    @Autowired
    TestCacheMapper testCacheMapper;
//    @Cacheable(cacheNames = {"methodB"})
    public String methodB(Integer id){
        String methodC = methodC(id);
        return methodC;
    }
    @Cacheable(cacheNames = {"methodC"})
    public String methodC(Integer id){
        TestCache testCache = testCacheMapper.selectOne(id);
        return testCache.toString();
    }
}
