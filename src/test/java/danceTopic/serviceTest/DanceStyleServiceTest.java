package danceTopic.serviceTest;

import org.junit.Test;

import danceTopic.dance.user.service.DanceStyleService;

public class DanceStyleServiceTest {

	@Test
	public void test() throws Exception{
		DanceStyleService danceStyleService = new DanceStyleService();
		
		danceStyleService.addDanceStyle(3, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0);
	}
	
}
