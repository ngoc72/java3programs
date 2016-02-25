<%-- 
    Document   : index
    Created on : Feb 24, 2016, 5:59:03 PM
    Author     : javauser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="/ClassProject/LoginServlet">
            click to register
        </a>
        
        <c:if test="${cookie.containsKey('FirstName')}">
            <p>user Name: ${cookie.FirstName.value}</p>
            
        </c:if>
    </body>
</html>
