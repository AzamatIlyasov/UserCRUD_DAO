<%--
  Created by IntelliJ IDEA.
  User: djaza
  Date: 10.03.2018
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Список пользователей</title>
</head>
<body>

<table border="2">
    <tr>
        <td>ID</td>
        <td>Имя</td>
        <td>Возраст</td>
        <!-- <td>Машины</td> -->
        <td>Действия</td>
    </tr>
    <c:forEach items="${users}" var="users">
        <tr>
            <td>${user.getId()}</td>
            <td>${user.getName()}</td>
            <td>${user.getAge()}</td>
            <!-- <td>${user.getAutos()}</td> -->
            <td>
                <form action="updateUser.jsp" method="post">
                    <input type="hidden" name="id" value="${user.getId()}">
                    <input type="hidden" name="name" value="${user.getName()}">
                    <input type="hidden" name="age" value="${user.getAge()}">
                    <input type="submit" value="Изменить" style="float:left">
                </form>
                <form action="deleteUser.jsp" method="post">
                    <input type="hidden" name="id" value="${user.getId()}">
                    <input type="submit" value="Удалить" style="float:left">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

<form action="addUser.jsp">
    <input type="submit" value="Добавить нового пользователя">
</form>

</body>
</html>
