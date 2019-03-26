package com.lifeng.demo;

import java.util.Scanner;

/** 
 * @CompanyName lhfinance.com
 * @ClassName Test13.java 
 * @Package com.lifeng.demo 
 * @Description: (用一句话描述该文件做什么) 
 * @author lf  
 * @date 2019年3月18日 下午8:54:08 
 * @version V1.0.0
 *
 */
public class Test13 {
	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in); System.out.println("请输入4位会员卡号:");
		 * String string = scanner.next(); char [] ch = string.toCharArray(); int sum=0;
		 * for (int i = 0; i < ch.length; i++) {
		 * sum+=Integer.parseInt(String.valueOf(ch[i]));; }
		 * System.out.println("会员卡号"+string+"各位之和:"+sum);
		 * System.out.println("是幸运客户吗?"+(sum>20?"true":"false"));
		 */

		/*
		 * char a = '我',b='爱',c='学'; String string =
		 * String.valueOf(a)+String.valueOf(b)+String.valueOf(c);
		 * System.out.println(string);
		 * 
		 * int sum = 0; for (int i = 0; i <= 100; i++) { if(i%2 == 1) { sum+=i; } }
		 * System.out.println(sum);
		 */
		//根据给定的方法来输出一个等腰三角
		//		int max = 5; 
		//		//控制行数
		//		for(int i = 5; i>=1 ; i--) {
		//			//控制空格
		//			for (int j = 1; j <= max - i; j++) { 
		//				System.out.print(" ");
		//			}
		//			//控制星数
		//			for (int k = 1; k <= i * 2 - 1; k++) {
		//				System.out.print("*");
		//			}
		//			System.out.println();    
		//		}
		int c = 0;
		for (int i = 100; i <1000 ; i++) {

			int BaiNum = i/100;//分解出百位

			int ShiNum = i/10%10;//分解出十位

			int GeNum = i%10;//分解出个位

			//判断是否为水仙花数，即百位的三次方+十位的三次方+个位的三次方=数字本身

			if(BaiNum*BaiNum*BaiNum + ShiNum*ShiNum*ShiNum + GeNum*GeNum*GeNum == i) {
				c++;
				System.out.println(i+"为水仙花数");
			}
		}
		System.out.println(15%10);
		System.out.println("1000以内水仙花数量:"+c);
	}
}
