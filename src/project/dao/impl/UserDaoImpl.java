package project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Statement;

import project.bean.User;
import project.dao.UserDao;
import project.util.DBUtil;

/**
 * userDao接口实现类
 */
public class UserDaoImpl implements UserDao {

	public Connection conn = null;
	public ResultSet rs = null;
	public PreparedStatement ps = null;

	@Override
	public List<User> queryAllData() {
		return null;
	}

	/**
	 * 新增(注册)
	 */
	@Override
	public int insertData(User t) {
		conn = DBUtil.getConnection();
		try {
			String sql = "insert into tb_user values('"+t.getEmail()+"','"+t.getPassword()+"')";
			ps = conn.prepareStatement(sql);
			return ps.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ps, conn);
		}
		return 0;
	}

	@Override
	public int update(User t) {
		return 0;
	}

	@Override
	public int delete(int id) {
		return 0;
	}

	@Override
	public User queryDataById(int id) {
		return null;
	}

	/**
	 * 登录 根据邮箱查询并返回user
	 * 
	 * @param user
	 * @return
	 */
	@Override
	public User getUser(User user) {
		conn = DBUtil.getConnection();
		try {
			String sql = "select * from tb_user where email = '"+user.getEmail()+"'";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery(sql);
			if (rs.next()) {
				User user2 = new User(rs.getString(1), rs.getString(2));
				return user2;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ps, conn);
		}
		return null;
	}

}
