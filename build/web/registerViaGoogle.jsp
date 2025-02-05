<%-- 
    Document   : register
    Created on : Jan 24, 2025, 7:32:17 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title> Responsive Login and Signup Form </title>

        <!-- CSS -->
        <link rel="stylesheet" href="css/index.css">

        <!-- Boxicons CSS -->
        <link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
    </head>

    <body>
        <section class="container forms">
            <div class="form login">
                <div class="form-content">
                   

                    <div class="form-link">
                        <span>Don't have an account? <a id="register" href="" class="link signup-link">Signup</a></span>
                    </div>
                </div>

                

          
            </div>

            <!-- Signup Form -->
            <div class="form signup">
                <div class="form-content">
                    <header>Signup</header>
                    <form action="register?action=registerViaGoogle" method="post">
                        <div class="field input-field">
                            <input type="text" placeholder="User Name" class="username" name="userName" value="${param.userName}" required>
                        </div>

                        <div class="field input-field">
                            <input type="email" placeholder="Email" class="input" name="userEmail" value="${param.userEmail}" required>
                        </div>

                        <div class="field input-field">
                            <input type="password" placeholder="Create password" class="password" name="userPass"  required>
                        </div>

                        <div class="field input-field">
                            <input type="password" placeholder="Confirm password" class="password" name="confirmPass" required>
                            <i class='bx bx-hide eye-icon'></i>
                        </div>

                        <div class="field">
                            <input type="text" placeholder="Address" class="userAddress" name="userAddress" value="${param.userAddress}" required>
                        </div>

                        <div class="field">
                            <input type="text" placeholder="Phone Number" class="phoneNumber" name="phoneNumber" value="${param.phoneNumber}" required>
                        </div>

                        <div class="field button-field">
                            <button type="submit">Signup</button>
                        </div>
                    </form>

                    
                </div>

                

                
            </div>
        </section>
        <script>
            window.onload = function () {
               
                    document.getElementById("register").click();
                
            };
        </script>

        <!-- JavaScript -->
        <script src="js/index.js"></script>
    </body>

</html>
