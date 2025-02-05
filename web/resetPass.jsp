<%-- 
    Document   : resetPass
    Created on : Feb 5, 2025, 8:28:27 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
    <link rel="stylesheet" href="css/resetPass.css">
</head>
<body>
    <div class="container">
        <div class="form-container">
            <!-- Reset Password Form -->
            <form action="ChangeForgotPassword" method="post" id="reset-password-form" class="form">
                <h2>Reset Password</h2>
                <input type="password" id="new-password" placeholder="New Password" name="newPassword" required>
                <input type="password" id="confirm-password" placeholder="Confirm Password" name="confirmPassword" required>
                <p class="error-message" style="color: red">${confirmPassError != null ? confirmPassError : ''}</p>
                <button type="submit" class="btn">Confirm</button>
            </form>
        </div>
    </div>
</body>
</html>
