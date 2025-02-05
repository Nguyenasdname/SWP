<%-- 
    Document   : forgot
    Created on : Jan 28, 2025, 9:36:24 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
    <link rel="stylesheet" href="css/forgotPass.css">
</head>
<body>
    <div class="container">
        <div class="form-container">
            <!-- Forgot Password Form -->
            <form action="ForgotPassword" method="post" id="forgot-password-form" class="form">
                <h2>Forgot Password</h2>
                <input type="email" name="userEmail" id="forgot-email" placeholder="Enter your email" required>
                <button type="submit" class="btn">Send OTP</button>
                <p class="error-message" style="color: red;">${emailError != null ? emailError : ''}</p>
            </form>
        </div>
    </div>
</body>
</html>
