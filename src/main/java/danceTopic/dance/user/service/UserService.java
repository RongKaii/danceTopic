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
		int id = getid(useremail);
		danceStyleDao.delete(id);
		userDao.delete(id);
	}
	
	//  查詢單筆(根據useremail)
	public User getUser(String useremail) {
		User user = userDao.getUser(useremail);
		return user;
	}
	
	// 修改用戶資料(不含email,密碼)
	public void updateUserInformation(String username, String dancername, 
			   String birth, String sex, String area, String useremail) {
		User user = new User();
		
		user.setUserid(getid(useremail));
		user.setUsername(username);
		user.setDancername(dancername);
		user.setBirth(birth);
		user.setSex(sex);
		user.setArea(area);
		
		userDao.updateUserInformation(user);
	}
	
	// 修改email
	public void updateEmail(String useremail, String new_useremail) {
		
		userDao.updateEmail(getid(useremail), new_useremail);
		
	}
	
	// 修改password
	public void updatePassword(String useremail, String password, String new_password) {
		// 取得user 物件
		User user = getUser(useremail);
		if(user == null) {
			System.out.println("此useremail不存在");
		}
		// 先驗證輸入舊密碼是否正確
		byte[] result = md5.digest(password.getBytes());
		String encryptPassword = String.format("%032X", new BigInteger(result));
		if(user.getPassword().equals(encryptPassword)) { // 舊密碼相同
			// 更改密碼
			result = md5.digest(new_password.getBytes());
			encryptPassword = String.format("%032X", new BigInteger(result));
			userDao.updatePassword(user.getUserid(), encryptPassword);
			System.out.println("更改完成");
		}else {
			System.out.println("舊密碼錯誤");
		}
	}
	
	// checkLogin
		public User checkLogin(String useremail, String password) {
			if(useremail == null || password == null || useremail.trim().length() == 0 || password.trim().length() == 0) {
				return null;
			}
			User user = userDao.getUser(useremail);
			if(user == null) {
				return null;
			}
			
			// 比對表單輸入的密碼加密之後是否等於資料表中密碼欄位的加密資料
			byte[] result = md5.digest(password.getBytes());
			String encryptPassword = String.format("%032X", new BigInteger(result));
			
			return encryptPassword.equals(user.getPassword()) ? user : null;
			
		}
	
	
}
