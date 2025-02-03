<%-- 
    Document   : profile
    Created on : Feb 2, 2025, 10:27:19 PM
    Author     : Admin
--%>
<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HttpSession session1 = request.getSession(false);
            if (session1 == null || session1.getAttribute("user") == null) {
                response.sendRedirect("index.jsp");
            }
        %>
        <h1>Hello World!</h1>
        <form>
            <p>User Name: ${user.userName}</p>
            <p>User Address ${user.userAddress}</p>
            <p>User Phone Number ${user.phoneNumber}</p>
            <input type="text" value="${user.userIMG}" readonly>
            <br>
            <img src="${user.userIMG}" >
            <a href="editProfile.jsp">Edit Profile</a>
        </form>
    </body>
</html>
