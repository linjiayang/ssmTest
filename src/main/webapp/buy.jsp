<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/6/22
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>列出所有书籍</title>

    <style type="text/css">
        .even{background-color: #FFFF00}
        .odd{background-color: #FFCCFF}
        tr:hover{background-color: #FF99FF}
    </style >
    <script language="JavaScript">
        function test(id) {
            $.ajax({
                type:"post",
                url:"${APP_PATH}/tijia",
                data:{"id":id},

                success:function(){
                    alert("添加成功");
                }
            })

        }
    </script>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>

    <script type="text/javascript"
            src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>


</head>

<body style="text-align: center;"  background="3.jpg">
<%
    List<String> list=new ArrayList<String>();
%>
<form action="buy">
<table frame="border" width="85%" align="center">
    <tr>
        <td  align="center">书籍名</td>
        <td align="center">价格</td>
        <td align="center">购买</td>

    <tr>

        <c:forEach var="c" items="${book}" varStatus="status">
    <tr >
        <td align="center">${c.name }</td>
        <td align="center">${c.price }</td>
        <td align="center"><input type="button" id="${c.id}"  value="+" onclick="test('${c.id}')"></td>
            </tr>


    </c:forEach>
<%
    request.getSession().setAttribute("buys",list);
%>
</table>

<input type="button" id="01"  value="+" onclick="test('01')">
    <input type="submit" value="结算">
<br/>
</form>
</body>
</html>
