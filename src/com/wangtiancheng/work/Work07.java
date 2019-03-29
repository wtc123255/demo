package com.wangtiancheng.work;

/** 
  * @Email alifenga@163.com
  * @ClassName Work07.java 
  * @Package com.wangtiancheng.work 
  * @Description: (用一句话描述该文件做什么) 
  * @author lf  
  * @date 2019年3月27日 上午11:49:45 
  * @version V1.0.0
  *
  *
  * .编写程序解决“百钱买百鸡”问题。
  * .公鸡五钱一只，母鸡三钱一只，小鸡一钱三只，现有百钱欲买百鸡，共有多少种买法？
  */
public class Work07 {
	public static void main(String[] args) {
		int i=0;
		//公鸡循环 最多买100/5只
		for(int a=0;a<=100/5;a++) {
			for(int b=0;b<=100/2;b++) {
				for(int c=0;c<=300;c++) {
					if(a+b+c == 100 && 5*a+2*b+1/3*c == 100) {
						System.out.println("公鸡:"+a+"母鸡:"+b+"小鸡:"+c);
						i++;
					}
				}
			}
		}
		System.out.println(i+"种");
		
//		test(0,50,50);
//		test(2,45,53);
//		test(4,40,56);
//		test(6,35,59);
	}
	
	public static void test(int a,int b,int c) {
		System.out.println(5*a+2*b+1/3*c);
	}
}
