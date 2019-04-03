package project.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ReqAndRespEncoding.setEncoding(req, resp);
		Connection connection = null;
		List<String> list = new ArrayList<>();
		Random random = new Random();
		String sql = "select * from tm_text";
		ResultSet resultSet = null;
		PreparedStatement ps = null;
		try {
			connection = DBUtil.getConnection();
			ps = connection.prepareStatement(sql);
			resultSet = ps.executeQuery(sql);
			if(list.size() <= 0 || null == list) {
				while(resultSet.next()) {
					list.add(resultSet.getString(1));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(resultSet, ps, connection);
		}
		
		resp.getWriter().write(list.get(random.nextInt(list.size()-1)));
	}
}
