package org.example;

import org.example.domain.User;
import org.example.domain.UserData;
import org.example.exeption.UserAlreadyExistExeption;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");


        UserData userData = new UserData();
        try {
            userData.addUser(login, password);
            resp.getWriter().println("Create");
        } catch (UserAlreadyExistExeption exeption){
            req.getRequestDispatcher("/error").forward(req,resp);
        }



    }
}
