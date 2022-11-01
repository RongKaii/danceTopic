package danceTopic.dance.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import danceTopic.dance.user.entity.User;
import danceTopic.dance.user.service.UserService;

@WebServlet("/upadteuserin/")
public class updateUserInformationController extends HttpServlet{

	private UserService userService = new UserService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User user = new User();
		
		HttpSession session = req.getSession();
		Object useremail = session.getAttribute(user.getUseremail());
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/updateUserInformation.jsp");
		req.setAttribute("useremail", useremail);
		rd.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 取得資料
		String useremail = req.getParameter("useremail");
		String username = req.getParameter("username");
		String dancername = req.getParameter("dancername");
		String birth = req.getParameter("birth");
		String sex = req.getParameter("sex");
		String area = req.getParameter("area");

		// 修改user資料
		try {
			userService.updateUserInformation(username, dancername, birth, sex, area, useremail);
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500, e.getMessage());
			return;
		}
		resp.sendRedirect("/" + "danceTopic" + "/");  // 重導到首頁
	}
	
	
	
	
	
}
