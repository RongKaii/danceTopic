package danceTopic.dance.user.service;

import danceTopic.dance.user.dao.UserDao;
import danceTopic.dance.user.entity.User;

public class UserService {
	
	private UserDao userDao = new UserDao();

	// 新增user
	public int addUser(String username, String dancername, String password, String useremail, 
					   String birth, String sex, String area) throws Exception{
		User user = new User();
		
		user.setUsername(username);
		user.setDancername(dancername);
		user.setPassword(password);
		user.setUseremail(useremail);
		user.setBirth(birth);
		user.setSex(sex);
		user.setArea(area);
		
		int rowcount = userDao.addUser(user);
		return rowcount;
	}
	
}
