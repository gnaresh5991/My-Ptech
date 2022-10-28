package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/views")
public class ViewServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		try
		{
		Connection con =DBonnection.getCon();
		PreparedStatement ps=con.prepareStatement("select * from person51 where name=? and password=?");
		ps.setString(1,req.getParameter("un"));
		ps.setString(2,req.getParameter("pwd"));
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			PBean pb=new  LoginDao().login(req);
			pw.println(pb.getCity());
			pw.println(rs.getString(2));
			pw.println(rs.getString(3));
			pw.println(rs.getString(4));
			pw.println(rs.getFloat(5));
		}
		
		}
		catch (Exception e) {e.printStackTrace();		}
		RequestDispatcher rd=req.getRequestDispatcher("view.html");rd.include(req, res);
	}
}
