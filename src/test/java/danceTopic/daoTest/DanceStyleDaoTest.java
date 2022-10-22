package danceTopic.daoTest;

import org.junit.Test;

import danceTopic.dance.user.dao.DanceStyleDao;
import danceTopic.dance.user.entity.DanceStyle;

public class DanceStyleDaoTest {
	
	@Test
	public void test() {
		DanceStyle danceStyle = new DanceStyle();
		danceStyle.setUserid(2);
		danceStyle.setBreaking(1);
		danceStyle.setPopping(0);
		danceStyle.setHippop(1);
		danceStyle.setLocking(0);
		danceStyle.setJazz(0);
		danceStyle.setWaacking(0);
		danceStyle.setHouse(1);
		danceStyle.setDancehall(0);
		danceStyle.setGirlstyle(0);
		danceStyle.setKrump(0);
		
		DanceStyleDao danceStyleDao = new DanceStyleDao();
		danceStyleDao.addUserDanceStyle(danceStyle);
	}
	
}
