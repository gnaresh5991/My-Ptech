package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Addp")
public class EPD extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			
		try 
		{
			PBean pb= new PBean();
			pb.setId(Integer.parseInt(req.getParameter("pid")));
			pb.setName(req.getParameter("pn"));
			pb.setPassword(req.getParameter("pwd"));
			pb.setCity(req.getParameter("pc"));
			pb.setSal(Float.parseFloat(req.getParameter("psl")));
			int k=new InsertDAO().insertdata(pb);
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			if(k>0) {
				pw.println("Data added !");
			}
			else {
				pw.println("Data not added !");
			}
			RequestDispatcher rd=req.getRequestDispatcher("input.html");
			rd.include(req, res);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
