package com.wangtiancheng.work;

import java.util.Scanner;

/**
  * @Email alifenga@163.com
  * @ClassName Work02.java 
  * @Package com.wangtiancheng.work 
  * @Description: (作业02) 
  * @author lf  
  * @date 2019年3月27日 上午11:44:12 
  * @version V1.0.0
  * 
  * .编写程序，输入一个字符，判断它是否为小写字母，
  * .如果是，将它转换成大写字母，否则，不转换。
  *
  */
public class Work02 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("请输入一个字母:");
//		String str=sc.nextLine();
//		char c=str.charAt(0);
//		char ch=Character.isUpperCase(c)?Character.toLowerCase(c):Character.toUpperCase(c);//百度
//		System.out.println("转换后为:"+ch);
		
		
		System.out.println("请输入一个字母：\n");
		Scanner input = new Scanner(System.in);
		char zimu=input.next().charAt(0);
		if (zimu>=97&&zimu<=122){           //判断是否是小写字母
			System.err.println("该字母是小写字母");
			zimu=(char) (zimu-32);        //如果是小写字母则 将其转换成大写字母
			System.err.println("转换之后的大写字母是："+zimu);
		}
		else{
			System.out.println("该字母不是小写字母！");          
		}
		
	}
}
