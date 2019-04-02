package com.wangtiancheng.work;

import java.util.Scanner;
import java.util.regex.Pattern;

/** 
 *   编写程序:用户输入任意一个正整数n 请输出1*2*3.....*n的值
 *   两种方法实现
 *   程序输入:5
 *   输出1*2*3*4*5=?
 */
public class Work15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个正整数:");
		int num = 0;
		try {
			num = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("请输入正确的正整数!");
			return;
		}
		if(!checkNum(num)) {
			System.out.println("请输入正确的正整数!");
			return;
		}

		System.out.println("方法一结果:"+method1(num));
		System.out.println("方法二结果:"+method2(num));
	}

	/**
	 * 方法一
	 * @param i
	 * @return
	 */
	public static int method1(int i) {
		//补全代码
		return 0;
	}

	/**
	 * 方法二
	 * @param i
	 * @return
	 */
	public static int method2(int i) {
		//补全代码
		return 0;
	}

	/**
	 * 判断是否正整数
	 * @param num
	 * @return
	 */
	public static boolean checkNum(int num) {
		Pattern pattern = Pattern.compile("[0-9]*");
		return pattern.matcher(Integer.valueOf(num).toString()).matches();
	}
}
