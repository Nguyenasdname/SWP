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
        <%
            HttpSession session1 = request.getSession(false);
            if (session1 == null || session1.getAttribute("user") == null) {
                response.sendRedirect("index.jsp");
            }
        %>
        <h1>Welcome, User!</h1>
        <a href="logout">Logout</a>
    </body>
</html>
