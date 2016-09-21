package ro.enered.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import ro.enered.utils.DBConnection;

public class WebAuthControler {
	 static PreparedStatement pst;
	 static ResultSet rs;
	public static String doLogin(String user,String pass){
		
		Connection con=DBConnection.getConnection();
		try {
			pst= (PreparedStatement) con.prepareStatement("select * from WebUsers where Username=? AND Password =?");
			pst.setString(1, user);
			pst.setString(2, pass);
			rs=pst.executeQuery();
			while(rs.next()){
				return "ok";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "nok";
		
	}
	

}
