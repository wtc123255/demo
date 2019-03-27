package com.lifeng.demo;

/** 
 * @ClassName Test12.java 
 * @Package com.lifeng.demo 
 * @Description: (用一句话描述该文件做什么) 
 * @author lf  
 * @date 2019年3月18日 下午8:38:28 
 * @version V1.0.0
 *
 */
public class Test12 {
	public static void main(String[] args) {
		String string1 = "我爱学Java";
		String string2 = new String("我爱学Java");
		String string3 = String.valueOf(new char[]{'我','爱','学','J','a','v','a'}) ;
		
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
	}
}
