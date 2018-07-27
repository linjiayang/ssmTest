<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/6/22
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>列出所有书籍</title>

    <style type="text/css">
        .even{background-color: #FFFF00}
        .odd{background-color: #FFCCFF}
        tr:hover{background-color: #FF99FF}
    </style>
</head>
 <h2 align="center">将购买的书籍</h2>
<body style="text-align: center;"  background="3.jpg">
<<form action="/weixin.jsp">
    <table frame="border" width="85%" align="center">
        <tr>
            <td  align="center">书籍名</td>
            <td align="center">价格</td>


        <tr>

            <c:forEach var="c" items="${buy}" varStatus="status">
        <tr >
            <td align="center">${c.name }</td>
            <td align="center">${c.price }</td>

        </tr>
        </c:forEach>

    </table>
    <input value="付款" type="submit">
    <br/>

</body>
</html>
