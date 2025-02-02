<%-- 
    Document   : register
    Created on : Jan 24, 2025, 7:32:17 PM
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

        <form action="register" method="post">

            <input type="text" name="userName" value="${thisUserName}" placeholder="UserName">
            <p>${userNameError != null ? userNameError : ''}</p>
            <input type="text" name="userEmail" value="${thisUserEmail}" placeholder="Email">
            <p>${userEmailError != null ? userEmailError : ''}</p>
            <input type="password" name="userPass" placeholder="Password">
            <br><br>
            <input type="password" name="confirmPass" placeholder="Confirm Pasword">
            <p>${confirmPassError != null ? confirmPassError : ''}</p>

            <input type="text" name="userAddress" value="${thisUserAddress}" placeholder="Address">
            <br><br>
            <input type="text" name="phoneNumber" value="${thisPhoneNumber}" placeholder="Phone">

            <br><br>
            <input type="submit" value="Register">
            <br><br>

        </form>
    </body>
</html>
