

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serv1")
public class MyServlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.print("<h1>welcome to Servlet Day 3</h1>");
	String name=request.getParameter("uname");
	String email=request.getParameter("email");
	String pass=request.getParameter("upass");
	int eng=Integer.parseInt(request.getParameter("eng"));
	int mar=Integer.parseInt(request.getParameter("mar"));
	
	System.out.println("hello "+name);
	out.print("<b>Name :</b> "+name.toUpperCase());
	out.print("<br/><b>Email :</b> "+email);
	out.print("<br/><b>Password :</b> "+pass);
	out.print("<br/><b>Result :</b> "+(eng+mar));
	}

}
