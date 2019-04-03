package project.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.bean.User;
import project.service.UserService;
import project.service.impl.UserServiceImpl;

/** 
 * 注册
 */
@WebServlet("/registeredServlet")
public class RegisteredServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		try {
			UserService userService = new UserServiceImpl();
			User user = userService.getUserByEmail(req.getParameter("email"));
			if(user != null) {
				resp.getWriter().write("<script language = javascript>alert('该邮箱已经注册!');window.location.href='error.html'</script>");
			}else {
				int i = userService.insertData(new User(req.getParameter("email"),req.getParameter("password")));
				if(i == 1) {
					resp.getWriter().write("<script language = javascript>alert('注册成功!');window.location.href='success.html'</script>");
				}
			}
		}catch (Exception e) {
			resp.getWriter().write("<script language = javascript>alert('服务异常,注册失败!');window.location.href='error.html'</script>");
		}
	}
}
