package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		PBean pb=new LoginDao().login(req);
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		if(pb==null) {
			pw.print("invalid username / password");
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.include(req, res);
		}
		else {
			pw.println("welcome mr."+pb.getName());
			RequestDispatcher rd=req.getRequestDispatcher("view.html");
			rd.include(req, res);
		}
	}
}
