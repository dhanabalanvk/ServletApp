/**
 * 
 */
package com.dhana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * @author DhanabalanV
 *
 */
public class DBCon {
	
	public String readData(){
		Connection con = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.3.175.2:3306/sivam","root","sivam");
			Statement st = con.createStatement();
			rs = st.executeQuery("select * from team");
			String output="";
			while(rs.next()){
				output += rs.getString("name");
			}
			return output;
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
