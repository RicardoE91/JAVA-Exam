package exam;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class Ex6 {
	public static void main(String[] args) throws Exception {
		 Connection connection = Ex6connection.getConnection();
		 System.out.println(connection.getMetaData()
	                .getDatabaseProductName());
		 String sql = "Select * From state";
		 Statement stmt = null;
		 stmt = connection.createStatement();
		 ResultSet rs = stmt.executeQuery(sql);
		 List<Ex6state> ciudades = new ArrayList<>();
		 
		 while(rs.next()) {
			 Ex6state usr = new Ex6state();
			 usr.setState_id(rs.getInt("state_id"));
			 usr.setDescription(rs.getString("description"));
			 usr.setShipping_zone_id(rs.getString("shipping_zone_id"));
			 ciudades.add(usr);
		 }
		 
		 FileOutputStream out = null;
		 out = new FileOutputStream("C:\\Users\\curso\\RERI\\JAVA Exam\\JAVA Exam\\src\\exam\\estados.txt");
		 ByteArrayOutputStream bos = new ByteArrayOutputStream();
		 ObjectOutputStream oos = new ObjectOutputStream(bos);
		 oos.writeObject(ciudades);
		 byte[] bytes = bos.toByteArray();
		 out.write(bytes);
		 out.close();
	}
}