package danceTopic.dance.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
	protected static Connection conn;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String db_url = "jdbc:mysql://localhost:3306/danceTopic?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
			String db_username = "root";
			String db_password = "12345678";
			conn = DriverManager.getConnection(db_url, db_username, db_password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}