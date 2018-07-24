package test28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBCon {
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String id = "system";
	private static final String pwd = "12345678";
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;
	

	private static void open() {
		try {
			Class.forName(driver);
			DBCon.con = DriverManager.getConnection(url, id, pwd);
			System.out.println("접속완료");
			 String sql= "insert into test values(2,'철이','10','경기도')"; 
			   stmt.executeUpdate(sql); 
			stmt = con.createStatement();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getCon() {
		if (DBCon.con == null) {
			open();
		}
		return DBCon.con;
	}

	public static void close() {
		if (DBCon.con != null) {
			try {
				DBCon.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		DBCon.con = null;
	}

	public static void main(String[] args) {
		DBCon.getCon();
	}
}
