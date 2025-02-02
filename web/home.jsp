<%-- 
    Document   : home
    Created on : Jan 24, 2025, 10:38:14 PM
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
         <body>
        
        <h1>Welcome, ${sessionScope.user.userName}!</h1>
        <a href="logout">Logout</a>
        <a href="profile.jsp">Profile</a>
    </body>
</html>
