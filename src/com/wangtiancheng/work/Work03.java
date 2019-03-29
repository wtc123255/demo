package com.wangtiancheng.work;

import java.util.Scanner;

/** 
 * @Email alifenga@163.com
 * @ClassName Work03.java 
 * @Package com.wangtiancheng.work 
 * @Description: (用一句话描述该文件做什么) 
 * @author lf  
 * @date 2019年3月27日 上午11:47:24 
 * @version V1.0.0
 * 
 * 
 * .输入 3 个正数，判断能否构成一个三角形。
 */
public class Work03 {
	public static void main(String[] args) {
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("输入三条边");
		//        int a=sc.nextInt(); 
		//        int b=sc.nextInt();
		//        int c=sc.nextInt();
		//        if(a*a==(b*b+c*c)) {               
		//            System.out.println("是三角形");
		//        }else if (b*b==(a*a+c*c)){
		//          	System.out.println("是三角形");
		//       	}else if (c*c==(a*a+b*b)) {
		//           	System.out.println("是三角形");
		//       	}else {
		//            System.out.println("不是三角型");
		//        } 

		int a;
		int b;
		int c;
		System.out.println("请输入三个正整数：");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();

		if(a<=0||b<=0||c<=0){
			System.out.println("输入的必须是正整数！");
		}
		if((a+b)>c&&(a+c)>b&&(b+c)>a){
			System.out.println("能构成三角形！");
		}else{
			System.out.println("不能构成三角形！");
		}
	}
}
