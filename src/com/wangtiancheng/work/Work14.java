package com.wangtiancheng.work;

import java.util.Scanner;

/** 
 * 编写剪刀石头布程序,由用户输入石头剪刀布,然后输入机器人赢你的概率大于等于0并且小于等于100的10的倍数[0 10 20 30 40]
 * 循环10次来输出机器人赢你的结果,程序只考虑输赢不考虑平局的情况,且机器人的结果是随机的
 * 作为系统赢你的百分比,需要考虑用户输入错误信息的情况,如果出现异常清使用异常机制处理并提示错误信息
 * 
 */
public class Work14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入猜拳序号:[1.石头    2.剪刀    3.布]");
		int no = scanner.nextInt();
		System.out.println("请输入系统赢你的几率:[0 10 20 ... 100]");
		int num = scanner.nextInt();
	}
}
