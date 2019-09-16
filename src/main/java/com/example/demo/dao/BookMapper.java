package com.example.demo.dao;

import com.example.demo.pojo.Book;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface BookMapper extends Mapper<Book> {

    void save(@Param("book") Book book);
}
