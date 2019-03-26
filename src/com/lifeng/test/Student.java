package com.lifeng.test;

/** 
  * @CompanyName lhfinance.com
  * @ClassName Student.java 
  * @Package com.lifeng.test 
  * @Description: (用一句话描述该文件做什么) 
  * @author lf  
  * @date 2019年3月6日 下午4:12:23 
  * @version V1.0.0
  *
  */
public class Student {
	private String name; //姓名
	private float yw;//语文
	private float sx;//数学
	private float yy;//英语
	private float pj;//平均
	private float sum;//总分
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getYw() {
		return yw;
	}
	public void setYw(float yw) {
		this.yw = yw;
	}
	public float getSx() {
		return sx;
	}
	public void setSx(float sx) {
		this.sx = sx;
	}
	public float getYy() {
		return yy;
	}
	public void setYy(float yy) {
		this.yy = yy;
	}
	public float getPj() {
		return pj;
	}
	public void setPj(float pj) {
		this.pj = pj;
	}
	public float getSum() {
		return sum;
	}
	public void setSum(float sum) {
		this.sum = sum;
	}
}
