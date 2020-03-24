package PublicMethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public abstract class DOInterface implements PublicIn {
	@Override
	public void connectDB() throws SQLException {
	Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=JDBCDB",
				"wang", "1001");
				System.out.println("connect to DB");
	}

}
