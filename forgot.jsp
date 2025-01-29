<%-- 
    Document   : forgot
    Created on : Jan 28, 2025, 9:36:24 PM
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
        <form action="ForgotPassword" method="post">
            <input type="text" name="userEmail" placeholder="Email">
            <p>${emailError != null ? emailError : ''}</p>
            <input type="submit" value="Send OTP!">
        </form>
    </body>
</html>
