/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import emailService.JavaMail;
import emailService.JavaMailImp;
import dao.UserDao;
import dao.imp.UserDaoImp;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author Admin
 */
@WebServlet("/register")
public class Register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Register</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Register at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName").toLowerCase();
        String userPass = request.getParameter("userPass");
        String confirmPass = request.getParameter("confirmPass");
        String userAddress = request.getParameter("userAddress");
        String userEmail = request.getParameter("userEmail").toLowerCase();
        String phoneNumber = request.getParameter("phoneNumber");
        String action = request.getParameter("action");

        JavaMail jvm = new JavaMailImp();

        UserDao userDao = new UserDaoImp();

        User checkUser = null;

        User newUser = null;

        switch (action) {
            case "register":
                if (!userPass.equals(confirmPass)) {
                    request.setAttribute("confirmPassError", "Not Correct Password!");
                    request.setAttribute("thisUserName", userName);
                    request.setAttribute("thisUserAddress", userAddress);
                    request.setAttribute("thisUserEmail", userEmail);
                    request.setAttribute("thisPhoneNumber", phoneNumber);

                    request.getRequestDispatcher("register.jsp").forward(request, response);
                }

                checkUser = userDao.isUserExists(userName, userEmail);

                if (checkUser != null) {
                    if (userName.equals(checkUser.getUserName())) {
                        request.setAttribute("userNameError", "Already have this username, please choose another!");
                    } else if (userEmail.equals(checkUser.getUserEmail())) {
                        request.setAttribute("userEmailError", "Already have this email, please choose another!");
                    }
                    request.setAttribute("thisUserName", userName);
                    request.setAttribute("thisUserAddress", userAddress);
                    request.setAttribute("thisUserEmail", userEmail);
                    request.setAttribute("thisPhoneNumber", phoneNumber);
                    request.setAttribute("triggerClick", true);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                } else {
                    newUser = new User(1, userName, userPass, userEmail, userAddress, 1, null, 2, phoneNumber);

                    newUser.setUserCode(jvm.generatedOTP());

                    boolean sendMail = jvm.send(userEmail, "Verify YourEmail", newUser.getUserCode(), "Verify_OTP", newUser);

                    if (sendMail) {
                        HttpSession session = request.getSession();
                        session.setAttribute("user", newUser);
                        response.sendRedirect("verify.jsp?action=register");
                    }
                }

                break;

            case "registerViaGoogle":
                if (!userPass.equals(confirmPass)) {
                    request.setAttribute("confirmPassError", "Not Correct Password!");
                    request.setAttribute("thisUserName", userName);
                    request.setAttribute("thisUserAddress", userAddress);
                    request.setAttribute("thisUserEmail", userEmail);
                    request.setAttribute("thisPhoneNumber", phoneNumber);

                    request.getRequestDispatcher("registerViaGoogle.jsp").forward(request, response);
                }
                checkUser = userDao.isUserExists(userName, null);
                if (checkUser != null) {
                    if (userName.equals(checkUser.getUserName())) {
                        request.setAttribute("userNameError", "Already have this username, please choose another!");
                    }
                    request.setAttribute("thisUserName", userName);
                    request.setAttribute("thisUserAddress", userAddress);
                    request.setAttribute("thisUserEmail", userEmail);
                    request.setAttribute("thisPhoneNumber", phoneNumber);
                    request.setAttribute("triggerClick", true);
                    request.getRequestDispatcher("registerViaGoogle.jsp").forward(request, response);
                } else {
                    newUser = new User(1, userName, userPass, userEmail, userAddress, 1, null, 2, phoneNumber);

                    boolean addUser = userDao.addUser(newUser);

                    if (addUser) {
                        HttpSession session = request.getSession();
                        session.setAttribute("user", newUser);
                        response.sendRedirect("home.jsp");
                    }
                }

                break;
            default:
                break;
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
