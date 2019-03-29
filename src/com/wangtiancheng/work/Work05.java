package com.wangtiancheng.work;

import java.util.Scanner;

/** 
 * @Email alifenga@163.com
 * @ClassName Work05.java 
 * @Package com.wangtiancheng.work 
 * @Description: (用一句话描述该文件做什么) 
 * @author lf  
 * @date 2019年3月27日 上午11:48:34 
 * @version V1.0.0
 *
 * .编写程序，给定一个学生成绩，给出相应等级：
 * 90~100 优秀
 * 80~89 良好
 * 70~79 中等
 * 60~69 及格
 */
public class Work05 {
	public static void main(String[] args) {
		while(true) {
			System.out.println("请输学生的成绩：");//打印输出语句
			Scanner sc=new Scanner(System.in);//输入学生成绩
			int score = sc.nextInt();
			if(score>=90 && score<=100) {            //判断是什么等级然后输出
				System.out.println("优秀");       //咳咳  断电了   就这样吧
				break;
			}else if(score>=80 && score<=89) {
				System.out.println("良好");
				break;
			}else if (score>=70 && score<=79) {
				System.out.println("中等");
				break;
			}else if (score>=60 && score<=69) {
				System.out.println("及格");
				break;
			}else if (score<60) {
				System.out.println("不及格");
				break;
			}
		}
	}
}
