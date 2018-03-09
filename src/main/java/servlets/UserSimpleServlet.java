package servlets;

import models.User;
import services.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserSimpleServlet extends HttpServlet {

    private UserService userService = new UserService();

    public void init(ServletConfig servletConfig) {
        try {
            super.init(servletConfig);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        List<User> users = userService.findAllUsers();
        request.setAttribute("users", users);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/showUsers.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

    }
}
