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
		Scanner sc=new Scanner(System.in);
		System.out.println("输入三条边");
        int a=sc.nextInt(); 
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a*a==(b*b+c*c)) {               
            System.out.println("是三角形");
        }else if (b*b==(a*a+c*c)){
          	System.out.println("是三角形");
       	}else if (c*c==(a*a+b*b)) {
           	System.out.println("是三角形");
       	}else {
            System.out.println("不是三角型");
        } 
	}
}
