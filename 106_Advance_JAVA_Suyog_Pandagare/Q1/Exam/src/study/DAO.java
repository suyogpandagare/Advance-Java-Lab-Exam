package study;

import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class DAO {
		
		public Connection getMyConnection()
		{
			Connection con = null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ietmarch22","root","root");
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return con;
		}
		
		public void addTaskPlan(String date,String task)
		{
			Connection con = getMyConnection();
			String defaultdate = "false"; 
			PreparedStatement pstmt;
			try {
				pstmt = con.prepareStatement("insert into planner values(default,?,?,?)");
				pstmt.setString(1, date);
				pstmt.setString(2, defaultdate);
				pstmt.setString(3, task);
				
				pstmt.executeUpdate();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}


