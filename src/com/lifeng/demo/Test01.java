package com.lifeng.demo;

import java.util.Arrays;
import java.util.List;

/** 
  * @ClassName Test01.java 
  * @Package com.lifeng.demo 
  * @Description: (用一句话描述该文件做什么) 
  * @author lf  
  * @date 2019年2月27日 上午9:36:20 
  * @version V1.0.0
  *
  */
public class Test01 {
	public static void main(String[] args) {
		List arr = Arrays.asList("张三","李四","王五");
		arr.forEach(System.out::println);
	}
}
