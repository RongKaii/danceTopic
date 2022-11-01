package danceTopic.daoTest;

import org.junit.Test;

import danceTopic.dance.user.dao.UserDao;
import danceTopic.dance.user.entity.User;

public class UserDaoTest {

	UserDao userDao = new UserDao();
	User user = new User();
	
//	@Test
//	public void test() {
//		User user = new User();
//		user.setUsername("楷");
//		user.setDancername("rongg");
//		user.setPassword("12345");
//		user.setUseremail("gmailgmaillll");
//		user.setBirth("2000-11-10");
//		user.setSex("男");
//		user.setArea("桃園");
//		
//		UserDao userDao = new UserDao();
//		userDao.addUser(user);
//		
//	}
	
//	@Test
//	public void test() {
//		User user = userDao.getid("j1234802@18hihjajosd");
//		System.out.println(user.getUserid());
//	}
	
	@Test
	public void test() {
//		userDao.delete("1@g");
//		

		User user = new User();
		System.out.println(user = userDao.getUser("2@g"));
		
	}


}
