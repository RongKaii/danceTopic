package danceTopic.serviceTest;

import org.junit.Test;

import danceTopic.dance.user.service.UserService;

public class UserServiceTest {

	UserService userService = new UserService();
	
//	@Test
//	public void test() throws Exception{
//		UserService userService = new UserService();
//		
//		userService.addUser("戎", "RongKai", "9212", "j1234gmail", "2000-11-10", "女", "台北");
//		
//	}
	
//	@Test
//	public void test() {
//		UserService userService = new UserService();
//		userService.getid("j1234802@18hihjajosd");
//	}
	
	@Test
	public void test() {
		userService.delete("1@g");
	}
}
