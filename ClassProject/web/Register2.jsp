<%-- 
    Document   : Register2
    Created on : Feb 24, 2016, 6:07:39 PM
    Author     : javauser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="DetailServlet" method="POST">
            Enter Favorite Color:
            <input type ="text" name="Color"><br>
            Enter Favorite Pet:
            <input type ="text" name="Pet"><br>
            Enter Favorite Music:
            <input type ="text" name="Music"><br>
            <input type ="submit" value="Submit Detail">           
        </form>
    </body>
</html>
