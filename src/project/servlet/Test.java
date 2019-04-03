package project.servlet;

import project.bean.User;
import project.service.UserService;
import project.service.impl.UserServiceImpl;

/** 
 *
 */
public class Test {
	public static void main(String[] args) {
		User user = new User("alifenga@163.com","123456");
		UserService userService = new UserServiceImpl();
		int i = userService.insertData(user);
		System.out.println(i);
	}
}
