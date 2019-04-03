package project.service;

import project.bean.User;
import project.common.IServiceCommand;

/** 
 * userService层
 */
public interface UserService extends IServiceCommand<User>  {
	//这里与dao层的是一样的意思
	//自己扩展的方法写下面
	public User getUser(User user);
	
	public User getUserByEmail(String username);
}
