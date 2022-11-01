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

@WebServlet("/updateemail/")
public class UpdateUserEmailController extends HttpServlet{

	private UserService userService = new UserService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User user = new User();
		HttpSession session = req.getSession();
		Object useremail = session.getAttribute(user.getUseremail());
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/updateUserEmail.jsp");
		req.setAttribute("useremail", useremail);
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 取得資料
		String useremail = req.getParameter("useremail");
		String new_useremail = req.getParameter("new_useremail");
		
		// 修改email
		try {
			userService.updateEmail(useremail, new_useremail);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.sendRedirect("/" + "danceTopic" + "/");  // 重導到首頁
	}

	
	
}
