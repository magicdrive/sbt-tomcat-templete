package net.magicd.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloJavaServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("Hello, Java with Servlet");
        out.println("</html>");
        out.close();
    }
}
