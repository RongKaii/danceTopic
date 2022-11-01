package danceTopic.daoTest;

import org.junit.Test;

import danceTopic.dance.user.dao.DanceStyleDao;
import danceTopic.dance.user.entity.DanceStyle;

public class DanceStyleDaoTest {
	
	DanceStyle danceStyle = new DanceStyle();
	DanceStyleDao danceStyleDao = new DanceStyleDao();
	
	@Test
	public void test() {
		DanceStyle danceStyle = new DanceStyle();
		danceStyle.setUserid(37);
		danceStyle.setBreaking(1);
		danceStyle.setPopping(1);
		danceStyle.setHippop(1);
		danceStyle.setLocking(1);
		danceStyle.setJazz(1);
		danceStyle.setWaacking(1);
		danceStyle.setHouse(1);
		danceStyle.setDancehall(1);
		danceStyle.setGirlstyle(1);
		danceStyle.setKrump(1);
//		
//		DanceStyleDao danceStyleDao = new DanceStyleDao();
//		danceStyleDao.addUserDanceStyle(danceStyle);
		
//		danceStyleDao.delete(27);
		
		danceStyleDao.update(danceStyle);
	}
	
}
