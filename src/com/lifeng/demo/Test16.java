package com.lifeng.demo;

import java.util.Scanner;

/** 
 * @CompanyName lhfinance.com
 * @ClassName Test16.java 
 * @Package com.lifeng.demo 
 * @Description: (用一句话描述该文件做什么) 
 * @author lf  
 * @date 2019年3月19日 下午5:03:47 
 * @version V1.0.0
 *
 */
public class Test16 {
	static double balance = 1000;
	static Integer password = 123456;//设置默认密码  final关键字表示:最终的,不可修改的
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//验证账户密码,如果输入正确返回ture,否则返回false
		boolean isTrue = checkPassword(scanner);
		//如果返回错误直接跳出方法
		if(!isTrue) {
			return;
		}
		while (true) {
			System.out.println();
			int i = print(scanner);
			switch (i) {
			case 1:
				System.out.println("请输入取款金额:");
				double amt = scanner.nextDouble();
				if(amt <= 0) {
					System.out.println("取款金额需大于0");
				}else if(amt > balance){
					System.out.println("取款金额需小于账户余额!"+"账户当前余额:"+balance);
					break;
				}else {
					balance = balance - amt;
					System.out.println("取款成功,取款金额:"+amt+",账户当前余额:"+balance);
				}
				break;

			case 2:
				System.out.println("请输入存款金额:");
				double amt1 = scanner.nextDouble();
				if(amt1 <= 0) {
					System.out.println("存款金额需大于0");
					break;
				}else {
					balance = balance + amt1;
					System.out.println("存款成功,存款金额:"+amt1+",账户当前余额:"+balance);
				}
				break;
			case 3:
				System.out.println("账户当前余额:"+balance);
				break;
			case 4:
				System.out.println("退出成功");
				return;
			default:
				System.out.println("输入有误,请重新输入");
				break;
			}
		}
	}
	/*
	 * 打印语句
	 */
	public static int print(Scanner scanner) {
		System.out.println("**********简单ATM*********");
		System.out.println("1.取款");
		System.out.println("2.存款");
		System.out.println("3.余额");
		System.out.println("4.退出");
		System.out.println("请输入菜单对应数字进行操作:");
		return scanner.nextInt();
	}
	
	/**
	 * 密码校验
	 * @param scanner
	 * @return
	 */
	public static boolean checkPassword(Scanner scanner) {
		System.out.println("请输入账号密码(共三次机会):");
		Integer ps = scanner.nextInt();
		//接收输入的密码
		//equals 方法是String类从它的超类Object中继承的, 被用来检测两个对象是否相等，
		//即两个对象的内容是否相等，区分大小写。
		//对于字符串变量来说，使用“==”和“equals()”方法比较字符串时，其比较方法不同。
		//“==”比较两个变量本身的值，即两个对象在内存中的首地址。
		//“equals()”比较字符串中所包含的内容是否相同。
		if(password.equals(ps)) {
			return true;
		}else {
			//前面有给了一次输入机会,若果输入错误,则继续循环两次重新输入
			for (int i = 2; i > 0; i--) {
				System.out.println("密码错误,您还有"+i+"次机会,请重新输入:");
				ps = scanner.nextInt();
				//继续判断后续是否输入正确
				if(password.equals(ps)) {
					return true;
				//当i==1时还没有输入正确则结束系统
				}else if(i == 1) {
					System.out.println("连续三次密码输入错误,系统结束!");
					System.exit(0);
				}
			}
			return false;
		}
	}
}
