<%-- 
    Document   : index
    Created on : Jan 22, 2025, 8:19:48 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form action="login" method="post">
            
            <input type="text" name="userName" value="${thisUserName}" placeholder="Username">
            <br><br>
            <div>${errorMess}</div>
            <input type="password" name="userPass" placeholder="Password">
            <br><br>
            <input type="submit" value="Login">
            <br><br>
            <a href="register.jsp">Register</a>
            <br><br>
           
        </form>
    </body>
</html>
