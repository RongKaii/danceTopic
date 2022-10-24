package danceTopic.dance.user.controller;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.x.ContinuousOutputStream;

import danceTopic.dance.user.service.DanceStyleService;
import danceTopic.dance.user.service.UserService;

@WebServlet("/adduser/")
public class UserController extends HttpServlet{
	
	
	private UserService userService = new UserService();

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/useradd.jsp");
		rd.forward(req, resp);
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 取得表單資料
		String username = req.getParameter("username");
		String dancername = req.getParameter("dancername");
		String password = req.getParameter("password");
		String useremail = req.getParameter("useremail");
		String birth = req.getParameter("birth");
		String sex = req.getParameter("sex");
		String area = req.getParameter("area");
		
		// 新增
		try {
			userService.addUser(username, dancername, password, useremail, birth, sex, area);
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500, e.getMessage());
			return;
		}
		
		
		resp.sendRedirect("/" + "danceTopic" + "/adddancestyle");  // 重導到首頁
		
		
		
		
	}
}