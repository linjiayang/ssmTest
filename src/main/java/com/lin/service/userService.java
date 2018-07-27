package com.lin.service;

import com.lin.bean.user;
import com.lin.bean.userExample;
import com.lin.dao.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lin.bean.userExample.Criteria;
@Service
public class userService {
   @Autowired
    private userMapper usermaper;

    public boolean selectByName(String name,String password){
        userExample user=new userExample();
        Criteria criteria = user.createCriteria();
        criteria.andNameEqualTo(name);
        criteria.andPasswordEqualTo(password);
        long i=usermaper.countByExample(user);
        return i==0;
    }
    public void insert(user u){
        usermaper.insert(u);
    }
}
