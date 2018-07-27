package com.lin.controller;

import com.lin.bean.book;
import com.lin.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class buy {
    @Autowired
    bookService bookservice;


    @RequestMapping(value = "show")
    public  void show(HttpServletRequest req, HttpServletResponse resp) throws Exception{
        String signature = req.getParameter("signature");
        String timestamp = req.getParameter("timestamp");
        String nonce = req.getParameter("nonce");
        String echostr = req.getParameter("echostr");

        PrintWriter out = resp.getWriter();
        if (CheckUtil.checkSignature(signature, timestamp, nonce)) {
            out.print(echostr);
        }
}
  @RequestMapping(value = "buy")
    public void buy(HttpServletRequest request, HttpServletResponse response) throws Exception{
         List<String> ids=new ArrayList<String>();
        ids=(ArrayList<String>) request.getSession().getAttribute("buys");
      List<book> books=new ArrayList<book>();
         books=bookservice.selectByKeys(ids);
       request.setAttribute("buy",books);
      request.getRequestDispatcher("buy2.jsp").forward(request,response);
  }
  @RequestMapping(value="tijia")
  @ResponseBody
    public String tijia(HttpServletRequest request){
      if(request.getAttribute("ids")!=null){
         List<String> ids=new ArrayList<String>();
         ids.add(request.getParameter("id"));
         request.setAttribute("ids",ids);
         return "success";

      }else{
          List<String> ids=( List<String>)request.getAttribute("ids");
          ids.add(request.getParameter("id"));
          request.setAttribute("ids",ids);
          return "success";
      }



    }
}
