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
	public void delete(Integer userid) {
		String sql = "delete from user where userid=?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, userid);
			pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 修改用戶資料(不含email,密碼)
	public void updateUserInformation(User user) {
		String sql = "update user set username=?, dancername=?, birth=?, sex=?, area=? where userid=?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getDancername());
			pstmt.setString(3, user.getBirth());
			pstmt.setString(4, user.getSex());
			pstmt.setString(5, user.getArea());
			pstmt.setInt(6, user.getUserid());
			pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 修改 email
	public void updateEmail(Integer userid, String new_useremail) {
		String sql = "update user set useremail=? where userid=?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, new_useremail);
			pstmt.setInt(2, userid);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 修改 password
	public void updatePassword(Integer userid, String new_password) {
		String sql = "update user set password=? where userid=?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, new_password);
			pstmt.setInt(2, userid);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 查詢單筆(根據useremail)
	public User getUser(String useremail) {
		User user = null;
		String sql = "select userid, username, dancername, password, useremail, birth, sex, area, createtime from user where useremail=?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, useremail);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new User();
				user.setUserid(rs.getInt("userid"));
				user.setUsername(rs.getString("username"));
				user.setDancername(rs.getString("dancername"));
				user.setPassword(rs.getString("password"));
				user.setUseremail(rs.getString("useremail"));
				user.setBirth(rs.getString("birth"));
				user.setSex(rs.getString("sex"));
				user.setArea(rs.getString("area"));
				user.setCreatetime(rs.getTimestamp("createtime"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
