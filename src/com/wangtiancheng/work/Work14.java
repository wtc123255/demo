package com.wangtiancheng.work;

import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

/** 
 * 编写剪刀石头布程序,由用户输入石头剪刀布,然后输入机器人赢你的概率大于等于0并且小于等于100的10的倍数[0 10 20 30 40]
 * 循环10次来输出机器人赢你的结果,程序只考虑输赢不考虑平局的情况,且机器人的结果是随机的
 * 作为系统赢你的百分比,需要考虑用户输入错误信息的情况,如果出现异常清使用异常机制处理并提示错误信息
 */
public class Work14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("请输入猜拳序号:[1.石头    2.剪刀    3.布]");
			int no = scanner.nextInt();
			checkNo(no);

			System.out.println("请输入系统赢你的几率:[0 10 20 ... 100]");
			int num = scanner.nextInt();
			checkNum(num);

			getResult(no, num);
		} catch (InputMismatchException e) {
			System.out.println("请按照系统提示正确输入值");
		} catch (Exception e) {
			System.out.println("系统出现异常");
		}

	}

	/**
	 * 验证序号
	 */
	public static void checkNo(int no) {
		if(no != 1 && no != 2 && no != 3) {
			System.out.println("请输入正确的序号");
			System.exit(0);
		}
	}

	/**
	 * 验证几率
	 * @param num
	 */
	public static void checkNum(int num) {
		if(num < 0 || num > 100 || num %10 != 0) {
			System.out.println("请输入正确的几率");
			System.exit(0);
		}
	}

	/**
	 * 获取10以内的10个不重复的随机数
	 * 采用LinkedHashSet因为他是有序的 按照插入顺序来赋值
	 * HashSet是无序的不会按照自己的插入顺序保存,内部采用hash算法排序的会造成我们的数字变成有序排序
	 * 从而体现不出随机的场景,所以此处不采用HashSet
	 * 
	 * 10个数字已帮你写好方法了,自己调用方法写逻辑
	 * @return
	 */
	public static LinkedHashSet<Integer> getSet(){
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		Random random = new Random();
		while(true) {
			if(set.size() < 10) {
				set.add(random.nextInt(10));
			}else {
				break;
			}
		}
		return set;
	}
	
	/**
	 * 获取结果
	 * @param no
	 * @param num
	 * @param set
	 */
	public static void getResult(int no,int num) {
		for (Integer i : getSet()) {
			if(no == 1) {
				if(num > i*10 ) {
					System.out.println("机器人:布,你输了!");
				}else {
					System.out.println("机器人:剪刀,你赢了!");
				}
			}else if (no == 2) {
				if(num > i*10 ) {
					System.out.println("机器人:石头,你输了!");
				}else {
					System.out.println("机器人:布,你赢了!");
				}
			}else {
				if(num > i*10 ) {
					System.out.println("机器人:剪刀,你输了!");
				}else {
					System.out.println("机器人:石头,你赢了!");
				}
			}
		}
	}
}
