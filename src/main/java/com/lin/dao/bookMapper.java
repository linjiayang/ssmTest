package com.lin.dao;

import com.lin.bean.book;
import com.lin.bean.bookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface bookMapper {
    long countByExample(bookExample example);

    int deleteByExample(bookExample example);

    int deleteByPrimaryKey(String id);

    int insert(book record);

    int insertSelective(book record);

    List<book> selectByExample(bookExample example);

    book selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") book record, @Param("example") bookExample example);

    int updateByExample(@Param("record") book record, @Param("example") bookExample example);

    int updateByPrimaryKeySelective(book record);

    int updateByPrimaryKey(book record);
}