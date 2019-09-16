package com.example.demo.controller;

import com.example.demo.dao.BookMapper;
import com.example.demo.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @RequestMapping("/save")
    public String save(){
        Book book=new Book();
        book.setId(1);
        book.setName("瓜田李下");

        bookMapper.save(book);

        return "success";
    }

    @RequestMapping("/update")
    public Book update(){
        Book book=bookMapper.selectByPrimaryKey(1);
        book.setName("海贼王");
        book.setUpdateTime(null);

        bookMapper.updateByPrimaryKeySelective(book);

        return bookMapper.selectByPrimaryKey(book.getId());
    }
}
