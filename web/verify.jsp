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

        <link rel="stylesheet" href="css/verify.css">


        <!-- Boxicons CSS -->
        <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>

    </head>
    <body>

        <section class="container forms">
            <div class="form verify">
                <div class="form-content">
                    <header>Verify Your Email</header>
                    <p>Enter the OTP sent to your email.</p>

                    <form action="VerifyOTP?action=${param.action}" method="post">
                        <div class="field input-field">
                            <input type="text" id="otp-input" placeholder="Enter OTP" class="input" name="verifyCode" maxlength="6" required>
                            <div style="color: red; margin-top: 10px">${verifyError != null ? verifyError : ''}</div>
                        </div>

                        <div class="field button-field">
                            <button type="submit" id="verify-btn">Verify</button>
                        </div>


                    </form>
                    <form action="SendAgainVerifyOTP" method="post">
                        <div class="form-link">
                            <a href="SendAgainVerifyOTP?action=${param.action}" id="resend-btn" class="link">Resend OTP</a>
                        </div>
                    </form>
                </div>
            </div>
        </section>


    </body>
</html>
