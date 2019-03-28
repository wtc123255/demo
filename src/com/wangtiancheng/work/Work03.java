package com.wangtiancheng.work;

import java.util.Scanner;

/** 
  * @Email alifenga@163.com
  * @ClassName Work03.java 
  * @Package com.wangtiancheng.work 
  * @Description: (用一句话描述该文件做什么) 
  * @author lf  
  * @date 2019年3月27日 上午11:47:24 
  * @version V1.0.0
  * 
  * 
  * .输入 3 个正数，判断能否构成一个三角形。
  */
public class Work03 {
	public static void main(String[] args) {
		int a[]=new int [3];
		int num=0;
	    Scanner input=new Scanner(System.in);
	    for (int i=0;i<a.length;i++) {
	    	System.err.println("请输入第"+(i+1)+"个数");
	    	a[i]=input.nextInt();
	    }
	    
	}
}
