<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/7/15
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h3>SpringMVC测试</h3>
        <a href="/springmvc/test">点击调转</a>

        <h3>SSM联调</h3>
        <a href="/springmvc/ssmTest">点击从数据库调取对象并返回到界面</a>

        <form action="/springmvc/save" method="post">
            姓名：<input type="text" name="name" value="大王"><br>
            金额：<input type="text" name="money" value="600"><br>
            <input type="submit" value="保存Account">
        </form>

    </body>
</html>
