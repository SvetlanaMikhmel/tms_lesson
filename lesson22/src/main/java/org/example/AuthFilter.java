package org.example;

import org.example.domain.UserData;
import org.example.exeption.UserLoginFailedExeption;

import javax.servlet.*;
import java.io.IOException;

public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        UserData userData = new UserData();
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        try {
            userData.checkPassword(login, password);
            chain.doFilter(request,response);
        } catch (UserLoginFailedExeption exeption){
            System.out.println("login failed");
            request.getRequestDispatcher("/").forward(request,response);
        }
    }

    @Override
    public void destroy() {

    }
}
