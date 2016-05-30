package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static String driverName;
	private static String dbURL;
	static{
		driverName = "org.sqlite.JDBC";
		dbURL="jdbc:sqlite:\\C:/Users/Administrator/Desktop/Guitarsale.db";
		//dbURL="jdbc:sqlite:Guitarsale.db";
	}
	public static Connection open(){
		try {
				Class.forName(driverName);
			try {
				return DriverManager.getConnection(dbURL);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void close(Connection Conn){
		if(Conn != null){
			try {
				Conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
