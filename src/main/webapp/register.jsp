<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/6/19
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body background="3.jpg">

    <h1 style="color:red" align="center">登录</h1>
    <form id="indexform" name="indexForm" action="/register" method="post" >
        <table border="0" align="center">
            <tr>
                <td>账号：</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="password" name="password">
                </td>
            </tr>
            <tr>
                <td> <input type="submit" value="登录" style="color:#BC8F8F"></td>

            </tr>
        </table>
        <br>

    </form>


</body>
</html>
