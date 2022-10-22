package danceTopic.dance.user.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {

	private Integer userid; 		// id
	private String username;		// 性名
	private String dancername;	// 舞名
	private String password;    // 密碼
	private String useremail;		// emil
	private String birth;			// 生日
	private String sex;			// 性別
	private String area;		// 地區
	private Date createtime; 	// 建立日期
	
	public User() {
		
	}

	public User(Integer userid, String username, String dancername, String password, String useremail, String birth,
			String sex, String area, Date createtime) {
		super();
		this.userid = userid;
		this.username = username;
		this.dancername = dancername;
		this.password = password;
		this.useremail = useremail;
		this.birth = birth;
		this.sex = sex;
		this.area = area;
		this.createtime = createtime;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDancername() {
		return dancername;
	}

	public void setDancername(String dancername) {
		this.dancername = dancername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", dancername=" + dancername + ", password="
				+ password + ", useremail=" + useremail + ", birth=" + birth + ", sex=" + sex + ", area=" + area
				+ ", createtime=" + createtime + "]";
	}
	
	
		
}
