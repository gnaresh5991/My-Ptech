package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertDAO {

	public int insertdata(PBean pb) 
	{	int k=0;
		try
		{
		Connection con=DBonnection.getCon();
		PreparedStatement ps=con.prepareStatement("INSERT INTO `springdb`.`person51` (`id`,`name`, `password`,`city`, `salary`) VALUES (?,?,?,?,?)");
		ps.setInt(1, pb.getId());
		ps.setString(2, pb.getName());
		ps.setString(3, pb.getPassword());
		ps.setString(4, pb.getCity());
		ps.setFloat(5, pb.getSal());
		 k=ps.executeUpdate();
			
			return k;
		}
		catch (Exception e) {
			e.printStackTrace();	
			}
		return k;

	}
}
