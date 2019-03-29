package com.wangtiancheng.work;

import java.util.Scanner;

/** 
  * @Email alifenga@163.com
  * @ClassName Work04.java 
  * @Package com.wangtiancheng.work 
  * @Description: (用一句话描述该文件做什么) 
  * @author lf  
  * @date 2019年3月27日 上午11:48:00 
  * @version V1.0.0
  *
  *
  * .编写程序，对输入的年、月、日，给出该天是该年的第多少天？
  */
public class Work04 {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("请输入月份");
    	int month = sc.nextInt();
    	System.out.print("请输入第几天");
    	int day = sc.nextInt();
    	int days = 0;
    	switch (month) {
    	case 12:
    	days += 30;
    	case 11:
    	days += 31;       
    	case 10:
    	days += 30;
    	case 9:
    	days += 31;
    	case 8:
    	days += 31;
    	case 7:
    	days += 30;
    	case 6:
    	days += 31;    
    	case 5:
    	days += 30;         
    	case 4:
    	days += 31;
    	case 3:
    	days += 28;
    	case 2:
    	days += 31;
    	case 1:
    	days += day;                 
    	}
    	if(days>365){
    	System.out.println("你输入的已经超过了365天了");
    	}else{
    	System.out.println("第" + days + "天");
    	}
	}
}
