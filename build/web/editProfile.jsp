<%-- 
    Document   : editProfile
    Created on : Feb 2, 2025, 11:02:22 PM
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
        
        <form action="EditProfile" method="post" enctype="multipart/form-data">
            <p>User Address: </p><input type="text" value="${user.userAddress}" name="userAddress">
            
            <p>Phone Number: </p><input type="text" value="${user.phoneNumber}" name="phoneNumber">
            
            <p>Profile Avatar: </p><input type="file" name="image">
            
            <br>
            
            <input type="submit" value="Confirm">
            
        </form>
    </body>
</html>
