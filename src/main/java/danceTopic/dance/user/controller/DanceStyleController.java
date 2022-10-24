package danceTopic.dance.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import danceTopic.dance.user.service.DanceStyleService;import danceTopic.dance.user.service.UserService;

@WebServlet("/adddancestyle")
public class DanceStyleController extends HttpServlet{

	private DanceStyleService danceStyleService = new DanceStyleService();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req.setAttribute("user", UserService);
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/adddancestyle.jsp");
		rd.forward(req, resp);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 舞風
		Integer userid = Integer.parseInt(req.getParameter("userid"));
		Integer breaking = Integer.parseInt(req.getParameter("breaking"));
		Integer popping = Integer.parseInt(req.getParameter("popping"));
		Integer hiphop = Integer.parseInt(req.getParameter("hiphop"));
		Integer locking = Integer.parseInt(req.getParameter("locking"));
		Integer jazz = Integer.parseInt(req.getParameter("jazz"));
		Integer Waacking = Integer.parseInt(req.getParameter("Waacking"));
		Integer house = Integer.parseInt(req.getParameter("house"));
		Integer dancehall = Integer.parseInt(req.getParameter("dancehall"));
		Integer girlstyle = Integer.parseInt(req.getParameter("girlstyle"));
		Integer krump = Integer.parseInt(req.getParameter("krump"));
		
		// 新增
		try {
			danceStyleService.addDanceStyle(userid, breaking, popping, hiphop, locking, jazz, Waacking, house, dancehall, girlstyle, krump);
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500, e.getMessage());
			return;
		}
	}
			
}
