package danceTopic.dance.user.service;

import java.math.BigInteger;

import danceTopic.dance.service.BaseService;
import danceTopic.dance.user.dao.DanceStyleDao;
import danceTopic.dance.user.dao.UserDao;
import danceTopic.dance.user.entity.User;

public class UserService extends BaseService{
	
	private UserDao userDao = new UserDao();
	private DanceStyleDao danceStyleDao = new DanceStyleDao();

	// 新增user
	public int addUser(String username, String dancername, String password, String useremail, 
					   String birth, String sex, String area) throws Exception{
		User user = new User();
		
		user.setUsername(username);
		user.setDancername(dancername);
		
		byte[] result = md5.digest(password.getBytes());
		String encryptPassword = String.format("%032X", new BigInteger(result));
		user.setPassword(encryptPassword);
		
		user.setUseremail(useremail);
		user.setBirth(birth);
		user.setSex(sex);
		user.setArea(area);
		
		int rowcount = userDao.addUser(user);
		return rowcount;
	}
	
	// 用email 查詢 userid
	public int getid(String useremail) {
		User user = userDao.getid(useremail);
		int id = user.getUserid();
		System.out.println(id);
		return id;
	}
	
	// 根據email刪除
	public void delete(String useremail) {
		danceStyleDao.delete(getid(useremail));
		userDao.delete(useremail);
	}
	
	
	
}
