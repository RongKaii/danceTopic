package danceTopic.dance.user.dao;

import java.sql.PreparedStatement;

import danceTopic.dance.user.entity.DanceStyle;

public class DanceStyleDao extends BaseDao{

	// 新增
	public int addUserDanceStyle(DanceStyle danceStyle) {
		int rowcount = 0;
		String sql = "insert into dancestyle(userid, breaking, popping, hiphop, locking, jazz, waacking, house, dancehall, girlstyle, krump) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, danceStyle.getUserid());
			pstmt.setInt(2, danceStyle.getBreaking());
			pstmt.setInt(3, danceStyle.getPopping());
			pstmt.setInt(4, danceStyle.getHippop());
			pstmt.setInt(5, danceStyle.getLocking());
			pstmt.setInt(6, danceStyle.getJazz());
			pstmt.setInt(7, danceStyle.getWaacking());
			pstmt.setInt(8, danceStyle.getHouse());
			pstmt.setInt(9, danceStyle.getDancehall());
			pstmt.setInt(10, danceStyle.getGirlstyle());
			pstmt.setInt(11, danceStyle.getKrump());
			rowcount = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rowcount;
	}
	
	// 根據userid刪除
	public void delete(Integer userid) {
		String sql = "delete from dancestyle where userid=?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, userid);
			pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 根據userid修改
	public void update(DanceStyle danceStyle) {
		String sql = "update dancestyle set breaking=?, popping=?, hiphop=?, locking=?, jazz=?, waacking=?, house=?, dancehall=?, girlstyle=?, krump=? where userid=?";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, danceStyle.getBreaking());
			pstmt.setInt(2, danceStyle.getPopping());
			pstmt.setInt(3, danceStyle.getHippop());
			pstmt.setInt(4, danceStyle.getLocking());
			pstmt.setInt(5, danceStyle.getJazz());
			pstmt.setInt(6, danceStyle.getWaacking());
			pstmt.setInt(7, danceStyle.getHouse());
			pstmt.setInt(8, danceStyle.getDancehall());
			pstmt.setInt(9, danceStyle.getGirlstyle());
			pstmt.setInt(10, danceStyle.getKrump());
			pstmt.setInt(11, danceStyle.getUserid());
			pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
