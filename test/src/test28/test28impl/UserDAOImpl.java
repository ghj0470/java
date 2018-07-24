package test28.test28impl;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import test25.UserDAO;

public class UserDAOImpl implements UserDAO {

	private Connection con;
	public UserDAOImpl(Connection con) {
		this.con = con;
	}
	@Override
	public ArrayList<HashMap<String, String>> selectUserList() {
		ArrayList<HashMap<String, String>> al = 
				new ArrayList<HashMap<String, String>>();
		String sql = "select memNum,memName, memId,memPwd, memAge,memEtc,credat,cretim,moddat, modtim from member";
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ResultSet  rs = ps.executeQuery();
			while(rs.next()) {
				HashMap<String, String> hs = new HashMap<String, String>();
				hs.put("memNum", rs.getString("memNum"));
				hs.put("memName", rs.getString("memName"));
				hs.put("memId", rs.getString("memId"));
				hs.put("memPwd", rs.getString("memPwd"));
				hs.put("memAge", rs.getString("memAge"));
				hs.put("memEtc", rs.getString("memEtc"));
				hs.put("credat", rs.getString("credat"));
				hs.put("cretim", rs.getString("cretim"));
				hs.put("moddat", rs.getString("moddat"));
				hs.put("modtim", rs.getString("modtim"));
				al.add(hs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}

}
