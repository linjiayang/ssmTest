package com.lin.service;
import com.lin.bean.book;
import com.lin.dao.bookMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class bookService {
   @Autowired
    bookMapper bookmapper;
    @Test
    public List<book> selectAll(){
       return bookmapper.selectByExample(null);
    }

    public List<book> selectByKeys(List<String> list){
        List<book> books=new ArrayList<book>();
        for(int i=0;i<list.size();i++){
            book b=new book();
           b= bookmapper.selectByPrimaryKey(list.get(i));
           books.add(b);
        }
        return books;
    }


}
