package com.lin.controller;

import com.lin.bean.user;
import com.lin.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class register {
    @Autowired
   private userService userservice;
    private int id=2;
    @RequestMapping(value = "zhuce")
   public void zhuce(HttpServletResponse response, HttpServletRequest request) throws Exception{
       if(userservice.selectByName(request.getParameter("name"),request.getParameter("password"))){
           String success="注册成功";
           user u=new user();
           u.setId(String.valueOf(id));
            id++;
           u.setName(request.getParameter("name"));
           u.setPassword(request.getParameter("password"));
           userservice.insert(u);
           request.setAttribute("message" ,success);
           request.getRequestDispatcher("message.jsp").forward(request,response);
       }else{
           String fail="注册失败，用户已存在";
           request.setAttribute("message",fail);
           request.getRequestDispatcher("message.jsp").forward(request,response);
       }}
    @RequestMapping(value = "register")
   public void register(HttpServletRequest request,HttpServletResponse response)throws Exception{
       if(userservice.selectByName(request.getParameter("name"),request.getParameter("password"))){
           String fail="登录失败，密码与用户名不匹配";
           request.setAttribute("message",fail);
           request.getRequestDispatcher("message.jsp").forward(request,response);
       }else{
           request.getRequestDispatcher("welcome.jsp").forward(request,response);
       }
        }

}
