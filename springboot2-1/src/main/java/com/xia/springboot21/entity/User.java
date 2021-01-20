package com.xia.springboot21.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author: xia liang
 * @create: 2021/01/14 15:55
 */
@ApiModel(description="用户实体")
@Data
public class User {
    @ApiModelProperty("用户编号")
    private Long id;
    @ApiModelProperty("用户姓名")
    @NotNull
    private String name;
    @ApiModelProperty("用户年龄")
    @Max(100)
    @Min(10)
    private Integer age;
    
}
