package project.service.impl;

import java.util.List;

import project.bean.User;
import project.dao.UserDao;
import project.dao.impl.UserDaoImpl;
import project.service.UserService;
import project.util.MD5Util;

/** 
 * Service实现类
 */
public class UserServiceImpl implements UserService{

	//这里的 service层要想玉 dao层(BAL层逻辑层)建立联系那么必须要 创建  dao层的对象  
	UserDao userDao = new UserDaoImpl();//创建了 dao层的Imp对象 
	
	@Override
	public List<User> queryAllData() {
		return userDao.queryAllData();
	}

	@Override
	public int insertData(User t) {
		//加密保存密码
		t.setPassword(MD5Util.getSaltMD5(t.getPassword()));
		return userDao.insertData(t);
	}

	@Override
	public int update(User t) {
		return userDao.update(t);
	}

	@Override
	public int delete(int id) {
		return userDao.delete(id);
	}

	@Override
	public User queryDataById(int id) {
		return userDao.queryDataById(id);
	}

	@Override
	public User getUser(User user) {
		User user2 = userDao.getUser(user);
		if(user2 != null) {
			//加密检验
			if(MD5Util.getSaltverifyMD5(user.getPassword(),user2.getPassword())) {
				return user2;
			}
		}
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		User user = new User();
		user.setEmail(email);
		return userDao.getUser(user);
	}
}
