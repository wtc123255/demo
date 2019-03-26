package com.lifeng.demo;

import java.util.Scanner;

/** 
 * @CompanyName lhfinance.com
 * @ClassName Test17.java 
 * @Package com.lifeng.demo 
 * @Description: (随机生成X个两位数加法题,答对+Y分,答错-X分) 
 * @author lf  
 * @date 2019年3月25日 下午11:13:55 
 * @version V1.0.0
 * 题目扩展:关键字static,Math类
 * static学习:https://www.cnblogs.com/hcl22/p/6371939.html
 * Math常用API:https://www.cnblogs.com/HelloBigTable/p/10356977.html
 */
public class Test17 {
	static Scanner scanner = new Scanner(System.in);
	//这三个参数默认赋值不建议修改
	static Integer score = 0;//初始分数
	static Integer trueCount = 0;//初始回答正确次数
	static Integer falseCount = 0;//初始回答错误次数

	//这三个参数自行修改配置
	static Integer problemCount = 5;//初始化题目数量
	static Integer trueScore = 20;//回答正确加分
	static Integer falseScore = 100;//回答错误扣分

	public static void main(String[] args) {
		//根据回答错误是否扣分来拼装字符串
		String string = getString();
		System.out.println("*********答题开始(共"+problemCount+"题,回答正确+"+trueScore+"分,"+string+")*********");
		//循环题目数量数量,生成problemCount个题目由用户回答
		for (int i = 1; i <= problemCount; i++) {
			//生成题目的方法
			random(i);
		}
		//打印语句,换行
		System.out.println();
		System.out.println("答题结束:");
		System.out.println("共"+problemCount+"题,回答正确数量:"+trueCount+",回答错误数量:"+falseCount+",总分:"+score);
	}

	/**
	 * 随机生成题目,返回回答分数
	 * @param i
	 * @return
	 */
	public static void random(int i) {
		//生成随机的两位数,生成两个
		int x = (int)(10+Math.random()*90);
		int y = (int)(10+Math.random()*90);
		//组装生成的数变成题目给用户显示
		System.out.println("第"+i+"题:"+x+"+"+y+"=?,请回答:");
		//接收用户答案
		int answer = scanner.nextInt();
		//判断用户答案是否等于我们生成的两个两位数的和
		if(answer == x+y) {
			//回答正确,分数+trueScore分,回答正确次数+1,打印语句
			score += trueScore;
			trueCount++;
			System.out.println("回答正确+"+trueScore+"分");
		}else{
			//回答错误,判断是否扣分
			if(isDeduction()) {
				//答错需要扣分-falseScore分
				score -= falseScore;
			}

			//回答错误,打印语句输出
			System.out.println(getString());
			//回答错误次数+1
			falseCount++;
		}
	}

	/**
	 * 判断答错是否扣分
	 * @return
	 */
	public static boolean isDeduction() {
		//falseScore>0则是扣分,返回true,否则不扣分返回false
		return falseScore>0;
	}

	/**
	 * 判断是否扣分返回字符串
	 * @return
	 */
	public static String getString() {
		String string;
		if(isDeduction()) {
			string = "回答错误-"+falseScore+"分";
		}else {
			string = "回答错误不计分";
		}
		return string;
	}
}
