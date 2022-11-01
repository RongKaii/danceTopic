package filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import danceTopic.dance.user.entity.User;
import danceTopic.dance.user.service.UserService;

@WebFilter(urlPatterns = {"/upadteuserin/", "/updateemail/", "/updatepassword/", "/updatedancestyle/"})
public class LoginFilter extends HttpFilter{

	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		UserService userService = new UserService();
		
		HttpSession session = req.getSession();
		
		if(session.getAttribute("user") != null) {
			chain.doFilter(req, res); // 放行
		}else {
			String useremail = req.getParameter("useremail");
			String password = req.getParameter("password");
			System.out.println(useremail);
			System.out.println(password);
			System.out.println(req.getRequestURI());
			User user = userService.checkLogin(useremail, password);
			if(user != null) {
				session.setAttribute("user", user);
				String contextName = req.getServletContext().getServletContextName();
				res.sendRedirect(req.getRequestURI());
			}else {
				// 重導到 login 畫面
				RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/login.jsp");
				rd.forward(req, res);
			}
		}
		
	}
	
}
