package com.xia.springboot21.entity;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * @author: xia liang
 * @create: 2021/01/18 15:53
 */
@Data
public class Children  extends Father{
    private String name;
    private Integer id;
}
