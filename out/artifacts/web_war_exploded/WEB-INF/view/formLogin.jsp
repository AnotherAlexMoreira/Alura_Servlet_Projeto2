<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 07/06/19
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>

<c:url value="/entrada" var="linkEntradaServlet"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${linkEntradaServlet}" method="post">
        Login: <input type="text" name="login"/>
        Senha: <input type="password" name="senha"/>

        <input type="hidden" name="acao" value="Login">
        <input type="submit"/>
    </form>
</body>
</html>
