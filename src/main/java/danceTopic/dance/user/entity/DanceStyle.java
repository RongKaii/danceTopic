package danceTopic.dance.user.entity;

public class DanceStyle {
	
	private Integer dancestyleid;
	private Integer userid;
	private Integer breaking;
	private Integer popping;
	private Integer hippop;
	private Integer locking;
	private Integer jazz;
	private Integer waacking;
	private Integer house;
	private Integer dancehall;
	private Integer girlstyle;
	private Integer krump;
	
	// 關聯關係
	private User user;

	public DanceStyle() {
		super();
	}

	public DanceStyle(Integer dancestyleid, Integer userid, Integer breaking, Integer popping, Integer hippop,
			Integer locking, Integer jazz, Integer waacking, Integer house, Integer dancehall, Integer girlstyle,
			Integer krump, User user) {
		super();
		this.dancestyleid = dancestyleid;
		this.userid = userid;
		this.breaking = breaking;
		this.popping = popping;
		this.hippop = hippop;
		this.locking = locking;
		this.jazz = jazz;
		this.waacking = waacking;
		this.house = house;
		this.dancehall = dancehall;
		this.girlstyle = girlstyle;
		this.krump = krump;
		this.user = user;
	}

	public Integer getDancestyleid() {
		return dancestyleid;
	}

	public void setDancestyleid(Integer dancestyleid) {
		this.dancestyleid = dancestyleid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getBreaking() {
		return breaking;
	}

	public void setBreaking(Integer breaking) {
		this.breaking = breaking;
	}

	public Integer getPopping() {
		return popping;
	}

	public void setPopping(Integer popping) {
		this.popping = popping;
	}

	public Integer getHippop() {
		return hippop;
	}

	public void setHippop(Integer hippop) {
		this.hippop = hippop;
	}

	public Integer getLocking() {
		return locking;
	}

	public void setLocking(Integer locking) {
		this.locking = locking;
	}

	public Integer getJazz() {
		return jazz;
	}

	public void setJazz(Integer jazz) {
		this.jazz = jazz;
	}

	public Integer getWaacking() {
		return waacking;
	}

	public void setWaacking(Integer waacking) {
		this.waacking = waacking;
	}

	public Integer getHouse() {
		return house;
	}

	public void setHouse(Integer house) {
		this.house = house;
	}

	public Integer getDancehall() {
		return dancehall;
	}

	public void setDancehall(Integer dancehall) {
		this.dancehall = dancehall;
	}

	public Integer getGirlstyle() {
		return girlstyle;
	}

	public void setGirlstyle(Integer girlstyle) {
		this.girlstyle = girlstyle;
	}

	public Integer getKrump() {
		return krump;
	}

	public void setKrump(Integer krump) {
		this.krump = krump;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "DanceStyle [dancestyleid=" + dancestyleid + ", userid=" + userid + ", breaking=" + breaking
				+ ", popping=" + popping + ", hippop=" + hippop + ", locking=" + locking + ", jazz=" + jazz
				+ ", waacking=" + waacking + ", house=" + house + ", dancehall=" + dancehall + ", girlstyle="
				+ girlstyle + ", krump=" + krump + ", user=" + user + "]";
	}
	
	
		
}
