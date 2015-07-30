import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection2 {
	
	public static void main(String[] args){
		Connection c=null;
		Statement s=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
				c= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/smartdatabase","root","root");
			
	
			
				s=c.createStatement();
			
ResultSet r;

	r=s.executeQuery("select * from students");
	while (r.next()) {
		System.out
				.println("Id " + r.getString(1) + " NAME " + r.getString(2) + " GRADE " + r.getString(3));
	}
		r.close();
		s.close();
		c.close();
	

			
		} catch (ClassNotFoundException e) {
						e.printStackTrace();
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
