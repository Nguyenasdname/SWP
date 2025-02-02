<%-- 
    Document   : forgotChange
    Created on : Jan 28, 2025, 9:56:24 PM
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
        <form action="ChangeForgotPassword" method="post">
            <input type="text" name="newPassword" placeholder="New Password">
            <br><br>
            <input type="text" name="confirmPassword" placeholder="Confirm Password">
            <br><br>
            <p>${confirmPassError != null ? confirmPassError : ''}</p>
            <input type="submit" value="Change Password">
        </form>
    </body>
</html>
