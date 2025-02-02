<%-- 
    Document   : verify.jsp
    Created on : Jan 26, 2025, 9:33:59 PM
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
        
        <form action="VerifyNewAccount?action=${param.action}" method="post">
            <h1 name="action">${param.action}</h1>
            <%User u = (User) session.getAttribute("user");%>
            <h1><%=u.getUserName()%></h1>
            <input type="text" name="verifyCode">
            <p>${verifyError != null ? verifyError : ''}</p>
            <input type="submit" value="Verify">
        </form>
        <form action="SendAgainVerifyOTP" method="post">
            <input type="hidden" name="action" value="<%=request.getParameter("action")%>">
            <input type="submit" value="Send Code Again!">
        </form>    
    </body>
</html>
