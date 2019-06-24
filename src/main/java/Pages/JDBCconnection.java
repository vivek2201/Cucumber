package Pages;

import java.sql.DriverManager;

public class JDBCconnection {
	
	public void jbdcConnection() throws ClassNotFoundException
	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String user;
		//DriverManager.getConnection("jdbc:sqlserver://sql-secondary-sql-server-uat.database.windows.net:1433"+, user, password);
		
	}
	
	
	
	
	
}
