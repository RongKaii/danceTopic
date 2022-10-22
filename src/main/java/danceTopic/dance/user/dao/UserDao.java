package danceTopic.dance.user.dao;

import java.sql.PreparedStatement;

import danceTopic.dance.user.entity.User;

public class UserDao extends BaseDao{
	
	// 新增 
	public int addUser(User user) {
		int rowcount = 0;
		String sql = "insert into user(username, dancername, password, useremail, birth, sex, area) values(?, ?, ?, ?, ?, ?, ?)";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getDancername());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getUseremail());
			pstmt.setString(5, user.getBirth());
			pstmt.setString(6, user.getSex());
			pstmt.setString(7, user.getArea());
			rowcount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowcount;
	}
}
