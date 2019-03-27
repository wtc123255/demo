package com.lifeng.demo;

/** 
  * @ClassName Test08.java 
  * @Package com.lifeng.demo 
  * @Description: (用一句话描述该文件做什么) 
  * @author lf  
  * @date 2019年3月7日 下午1:37:16 
  * @version V1.0.0
  *
  */
public class Test08 {
	public static void main(String[] args) {
		int i =2;
		switch (i) {
		case 1:
			i = i+1;
		case 2:
			i = i+2;
		case 3:
			i = i+3;
		}
		System.out.println(i);
	}
}
