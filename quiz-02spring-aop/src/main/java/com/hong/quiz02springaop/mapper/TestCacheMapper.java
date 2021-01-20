package com.hong.quiz02springaop.mapper;

import com.hong.quiz02springaop.entity.TestCache;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestCacheMapper  {
    @Select("select * from test_cache where id = #{id}")
    TestCache selectOne(Integer id);
}
