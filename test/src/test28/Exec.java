package test28;

import java.util.ArrayList;
import java.util.HashMap;

import test28.test28impl.UserDAOImpl;



public class Exec {

	public static void main(String[] args) {
		UserDAOImpl udao = new UserDAOImpl(DBCon.getCon());
		ArrayList<HashMap<String,String>> userList
		= udao.selectUserList();
		
		for(HashMap<String,String> user:userList) {
			System.out.println(user);
		}
		
		DBCon.close();
		
	}
}