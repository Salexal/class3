package servlet.class6;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RequestDispatcherServlet",urlPatterns = "/RequestDispatcherServlet")
public class RequestDispatcherServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setAttribute("company","北京船只");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("DispatchForwardServlet");
        requestDispatcher.forward(request,response);

        RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("redirect.html");
        requestDispatcher1.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
