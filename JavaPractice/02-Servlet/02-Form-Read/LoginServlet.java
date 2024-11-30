import javax.servlet.*;
import javax.servelt.http.*;
import java.io.*;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException{

		String user = req.getParameter("username");
		String pw = req.getParameter("password");

		res.setContentType("text/html");

		PrintWriter pw = res.getWriter();

		pw.println("<h3>" + "Username: " + user + "</h3>");
		pw.println("<h3>" + "Password: " + pw + "</h3>");
		pw.close();
	}
}