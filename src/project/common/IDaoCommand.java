package project.common;

import java.util.List;

/** 
 * 数据增删改查公共接口
 * 泛型
 */
public interface IDaoCommand<T> {
	//查询所有的数据
	public List<T> queryAllData();
	//新增数据
	public int insertData(T t);
	//修改数据
	public int update(T t); 
	//删除数据
	public int delete(int id);
	//查询一条数据通过ID
	public T queryDataById(int id);
}
