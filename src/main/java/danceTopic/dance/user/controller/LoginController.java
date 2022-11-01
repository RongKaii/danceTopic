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

@WebServlet("/login/")
public class LoginController extends HttpServlet{

	private UserService userService = new UserService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/login.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		// 取得資料
		String useremail = req.getParameter("useremail");
		String password = req.getParameter("password");
		
		// 登入
		User user = userService.checkLogin(useremail, password);
		if(user != null) {
			session.setAttribute("user", user);
			String contextName = req.getServletContext().getServletContextName();
			// 重導到 首頁 畫面
			resp.sendRedirect("/" + "danceTopic" + "/");  // 重導到首頁
		}else {
			// 重導到 login 畫面
			RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/login.jsp");
			rd.forward(req, resp);
		}
		
	}
	
	
}
