package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection c = null;
		
//		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		try {
			
			//Đăng ký MYSQL 
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			//các thông số 
			String url ="jdbc:mysql://localhost:3306/ontap";
			String username = "root";
			String password = "";
			
			// tạo kết nối
			c = DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}
	
	public static void closeConnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void printInfo(Connection c) {
		if(c!=null) {
			try {
				DatabaseMetaData mtd = c.getMetaData();
				System.out.println(mtd.getDatabaseProductName());
				System.out.println(mtd.getDatabaseProductVersion());
				System.out.println(mtd.getUserName());
				System.out.println(mtd.getDriverName());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
