package com.example.demo.mapper;

import com.example.demo.entity.BookStore;
import com.example.demo.entity.BookStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookStoreMapper {
    long countByExample(BookStoreExample example);

    int deleteByExample(BookStoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BookStore record);

    int insertSelective(BookStore record);

    List<BookStore> selectByExample(BookStoreExample example);

    BookStore selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BookStore record, @Param("example") BookStoreExample example);

    int updateByExample(@Param("record") BookStore record, @Param("example") BookStoreExample example);

    int updateByPrimaryKeySelective(BookStore record);

    int updateByPrimaryKey(BookStore record);
}