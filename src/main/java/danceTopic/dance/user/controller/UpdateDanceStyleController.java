package danceTopic.dance.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import danceTopic.dance.user.entity.User;
import danceTopic.dance.user.service.DanceStyleService;import danceTopic.dance.user.service.UserService;

@WebServlet("/updatedancestyle/")
public class UpdateDanceStyleController extends HttpServlet{

	private DanceStyleService danceStyleService = new DanceStyleService();
	UserService userService = new UserService();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req.setAttribute("user", UserService);
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/updatedancestyle.jsp");
		rd.forward(req, resp);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 取得舞風資料
		String useremail = (req.getParameter("useremail"));
		Integer userid = userService.getid(useremail);
		Integer breaking = 0;
		if(req.getParameter("breaking") == null){
			breaking = 0;
		}else {
			breaking = 1;
		}
		Integer popping = 0;
		if(req.getParameter("popping") == null){
			popping = 0;
		}else {
			popping = 1;
		}		
		Integer hiphop = 0;
		if(req.getParameter("hiphop") == null){
			hiphop = 0;
		}else {
			hiphop = 1;
		}		
		Integer locking = 0;
		if(req.getParameter("locking") == null){
			locking = 0;
		}else {
			locking = 1;
		}		
		Integer jazz = 0;
		if(req.getParameter("jazz") == null){
			jazz = 0;
		}else {
			jazz = 1;
		}		
		Integer Waacking = 0;
		if(req.getParameter("Waacking") == null){
			Waacking = 0;
		}else {
			Waacking = 1;
		}		
		Integer house = 0;
		if(req.getParameter("house") == null){
			house = 0;
		}else {
			house = 1;
		}		
		Integer dancehall = 0;
		if(req.getParameter("dancehall") == null){
			dancehall = 0;
		}else {
			dancehall = 1;
		}		
		Integer girlstyle = 0;
		if(req.getParameter("girlstyle") == null){
			girlstyle = 0;
		}else {
			girlstyle = 1;
		}		
		Integer krump = 0;
		if(req.getParameter("krump") == null){
			krump = 0;
		}else {
			krump = 1;
		}		
		
		// 修改
		try {
			danceStyleService.updateDanceStyle(breaking, popping, hiphop, locking, jazz, Waacking, house, dancehall, girlstyle, krump, userid);
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500, e.getMessage());
			return;
		}
		
		resp.sendRedirect("/" + "danceTopic" + "/");  // 重導到首頁
	}
			
}
