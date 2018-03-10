<%--
  Created by IntelliJ IDEA.
  User: djaza
  Date: 10.03.2018
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добать нового пользователя</title>
</head>
<body>

<form action="/users" method="post" >
    <input required type="text" name="name" placeholder="Имя">
    <input required type="text" name="age" placeholder="Возраст">
    <input type="submit" value="Сохранить">
</form>

</body>
</html>
