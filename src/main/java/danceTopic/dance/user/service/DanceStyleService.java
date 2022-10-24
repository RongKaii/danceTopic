package danceTopic.dance.user.service;

import danceTopic.dance.user.dao.DanceStyleDao;
import danceTopic.dance.user.entity.DanceStyle;

public class DanceStyleService {

	private DanceStyleDao danceStyleDao = new DanceStyleDao();
	
	// 新增dancestyle
	public int addDanceStyle(Integer userid, Integer breaking, Integer popping, Integer hiphop,
							 Integer locking, Integer jazz, Integer waacking, Integer house,
							 Integer dancehall, Integer girlstyle, Integer krump) throws Exception{
		
		DanceStyle danceStyle = new DanceStyle();
		
		danceStyle.setUserid(userid);
		danceStyle.setBreaking(breaking);
		danceStyle.setPopping(popping);
		danceStyle.setHippop(hiphop);
		danceStyle.setLocking(locking);
		danceStyle.setJazz(jazz);
		danceStyle.setWaacking(waacking);
		danceStyle.setHouse(house);
		danceStyle.setDancehall(dancehall);
		danceStyle.setGirlstyle(girlstyle);
		danceStyle.setKrump(krump);
		
		int rowcount = danceStyleDao.addUserDanceStyle(danceStyle);
		return rowcount;
		
		
	}
	
}
