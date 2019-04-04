package project.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.util.DBUtil;
import project.util.ReqAndRespEncoding;

/** 
 * 句子查询
 */
@WebServlet("/textServlet")
public class TextServlet extends HttpServlet{

	public static Logger log = Logger.getLogger(TextServlet.class.toString());

	private static List<String> list;
	private static SimpleDateFormat sdf;

	/**
	 * 静态库加载数据,减少数据库连接通信
	 */
	static {
		sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		log.info("静态块代码获取数据中......");
		Connection connection = null;
		list = new ArrayList<>();
		String sql = "select * from tm_text";
		ResultSet resultSet = null;
		PreparedStatement ps = null;
		try {
			connection = DBUtil.getConnection();
			ps = connection.prepareStatement(sql);
			resultSet = ps.executeQuery(sql);
			log.info("正在查询数据......");
			int i = 0;
			while(resultSet.next()) {
				i++;
				String string = resultSet.getString(1);
				list.add(string);
				log.info("第"+i+"条数据:"+string);
			}
			log.info("数据获取完毕,共"+i+"条");
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(resultSet, ps, connection);
		} 
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ReqAndRespEncoding.setEncoding(req, resp);
		Random random = new Random();
		//随机获取0-list.size()-1任意下标,从list中取出返回
		String string = list.get(random.nextInt(list.size()-1));
		log.setLevel(Level.INFO);
		log.info(sdf.format(new Date())+"-获取:"+string);
		resp.getWriter().write(string);
	}
}
