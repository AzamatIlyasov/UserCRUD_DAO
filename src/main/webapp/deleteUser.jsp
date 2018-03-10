<%--
  Created by IntelliJ IDEA.
  User: djaza
  Date: 10.03.2018
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Удалить пользователя</title>
</head>
<body>

<p>Вы действительно хотите удалить пользователя ${param.id}?</p>
<form action="/users/${param.id}" method="post" >
    <input type="hidden" name="id" value="${param.id}">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Удалить">
</form>

</body>
</html>
