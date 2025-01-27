package pkg01_servlet_get;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class Main extends HttpServlet{
	String message = "";

	public void init() throws ServletException{
		message = "Hello World";
	}

	// Note that the 'doGet' method is protected
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException{
		res.setContentType("text/html");

		PrintWriter pw = res.getWriter();

		pw.println("<h1>" + message + "</h1>");
		pw.close();
	}

	public void destroy(){
		// Do Nothing
	}
}