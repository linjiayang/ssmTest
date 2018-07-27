package com.lin.test;

import com.lin.bean.book;
import com.lin.dao.bookMapper;
import com.lin.service.bookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class daoTest {
    @Autowired
    bookMapper bookmapper;
    @Test
    public void test(){
        book b=new book();
        b.setId("03");
        b.setName("程序设计");
        b.setPrice(50);
        bookmapper.insert(b);
    }
}
