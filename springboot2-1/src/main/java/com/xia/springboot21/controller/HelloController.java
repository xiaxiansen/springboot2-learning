package com.xia.springboot21.controller;

import com.xia.springboot21.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    Book book;
    @GetMapping("/book")
    public String book(){
        return book.toString();
    }
}
