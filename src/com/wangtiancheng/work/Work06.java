package com.wangtiancheng.work;

import java.util.Scanner;

/** 
  * @Email alifenga@163.com
  * @ClassName Work06.java 
  * @Package com.wangtiancheng.work 
  * @Description: (用一句话描述该文件做什么) 
  * @author lf  
  * @date 2019年3月27日 上午11:49:14 
  * @version V1.0.0
  *
  * .编写程序，对输入的一个整数，按相反顺序输出该数。例如，输入为 3578，输出为 8753。
  */
public class Work06 {
	public static void main(String[] args) {
	/*	System.out.println("请输入整数");
		Scanner sc = new Scanner(System.in);
		int read =sc.nextInt();
		StringBuilder sb = new StringBuilder(String.valueOf(read));
		System.out.println(sb.reverse());
	*/
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String string = String.valueOf(num);
		char[] ch = string.toCharArray();
		String str=" ";
		for (int i=ch.length-1;i>=0;i--) {
			str +=String.valueOf(ch[i]);
		}
        System.out.println(Integer.valueOf(str));
    }
}
