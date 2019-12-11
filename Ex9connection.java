package exam;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp.BasicDataSource;

public class Ex9connection {
	private static BasicDataSource ds;

    static {
        ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("");
        ds.setUrl("jdbc:mysql://localhost:3306/mydb");
    }
    
    private Ex9connection() {
    	
    }
	
    public static Connection getConnection() {
    	Connection connection = null;
    	try {
			connection = ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}return connection;
    }
}