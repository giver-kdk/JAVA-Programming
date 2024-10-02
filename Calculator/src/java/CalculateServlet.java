import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;

//@WebServlet(urlPatterns = {"/CalculateServlet"})
public class CalculateServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            response.setContentType("text/html;charset=UTF-8");
            
            int num1 = Integer.parseInt(request.getParameter("txtNum1"));
            int num2 = Integer.parseInt(request.getParameter("txtNum2"));
            
            int sum = num1 + num2;
            response.sendRedirect("Result.jsp?sum=" + sum);
        }
        catch(Exception err)
        {   
            System.out.println(err.getMessage());
        }
    }
}
