package project.dao;

import project.bean.User;
import project.common.IDaoCommand;

/** 
 * 用户Dao接口
 * 这里这个类 是为了 ,后续 添加自己需要的方法. 如:模糊查询, 分页查询....
 * 这个必须要继承ICommand类,那样就可以调用增删查改的方法了
 */
public interface UserDao extends IDaoCommand<User>{
	//自己扩展的方法写下面
	public User getUser(User user);
}
