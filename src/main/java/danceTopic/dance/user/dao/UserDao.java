package danceTopic.dance.user.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

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
	
	// 用email 查詢 userid
	public User getid(String useremail) {
		User user = null;
		String sql = "select userid from user where useremail=?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, useremail);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new User();
				user.setUserid(rs.getInt("userid"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	// 根據email刪除
	public void delete(String useremail) {
		String sql = "delete from user where useremail=?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, useremail);
			pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
