package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

import javax.servlet.http.HttpServletRequest;

public class LoginDao {

	PBean pb=null;
	public PBean login(HttpServletRequest req) 
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
				pb=new PBean();
				pb.setId(rs.getInt(1));
				pb.setName(rs.getString(2));
				pb.setPassword(rs.getString(3));
				pb.setCity(rs.getString(4));
				pb.setSal(rs.getFloat(5));
			}
		}
		catch (Exception e) {e.printStackTrace();}
		return pb;
	}
}
