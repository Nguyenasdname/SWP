<%-- 
    Document   : verify.jsp
    Created on : Jan 26, 2025, 9:33:59 PM
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
        <form action="VerifyNewAccount" method="post">
            <input type="text" name="verifyCode">
            <p>${verifyError != null ? verifyError : ''}</p>
            <input type="submit" value="Verify">
        </form>
    </body>
</html>
