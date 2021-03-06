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
import project.util.ReqAndRespEncoding;

/** 
 * 登录
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ReqAndRespEncoding.setEncoding(req, resp);
		User user = new User(req.getParameter("username"),req.getParameter("password"));
		UserService userService = new UserServiceImpl();
		user = userService.getUser(user);
		if(user == null) {
			resp.getWriter().write("<script language = javascript>alert('用户名或密码错误!');window.location.href='index.html'</script>");
		}else {
			resp.getWriter().write("<script language = javascript>window.location.href='http://120.79.85.81'</script>");
		}
	}
}
