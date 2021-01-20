package com.xia.springboot21.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: xia liang
 * @create: 2021/01/13 14:31
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Value("${book.name}")
    private String name;
    @Value("${book.author}")
    private String author;
}