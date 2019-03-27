package com.lifeng.demo;

/** 
 * @ClassName Test15.java 
 * @Package com.lifeng.demo 
 * @Description: (用一句话描述该文件做什么) 
 * @author lf  
 * @date 2019年3月19日 上午9:29:43 
 * @version V1.0.0
 *
 */
public class Test15 {
	public static void main(String[] args) {
		System.out.println(Test15.replaceSpace(new StringBuffer("比色法 发")));
	}
	public static String replaceSpace(StringBuffer str){
		return str.toString().replaceAll(" ", "%20");
	}
}
