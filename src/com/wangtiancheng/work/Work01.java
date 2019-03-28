package com.wangtiancheng.work;

import java.util.Scanner;

/**
  * 
  * @Email alifenga@163.com
  * @ClassName Work01.java 
  * @Package com.wangtiancheng.work 
  * @Description: (作业01) 
  * @author lf  
  * @date 2019年3月27日 上午11:42:58 
  * @version V1.0.0
  *
  * .用数组接收用户输入的10个值
  * .去掉最大数和最小数打印剩余的8个值,和打印从小到大排序的8个值
  * .打印这8个值的和以及平均数
  */
public class Work01 {
	public static void main(String[] args) {
		int t;
		int num=0;
		int a[]=new int[10];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("请输入"+(i+1)+"个数：");
			a[i]=input.nextInt();
		}
		for(int i =0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("最小数是："+a[0]);
		System.out.println("最大数是："+a[9]);
		for(int i=0;i<a.length;i++)
		{
			if(i==0||i==9)continue;
			System.out.print(a[i]+" ");
			num+=a[i];
		}
		System.out.println();
		System.out.println("8个数的和为"+num+",平均值为："+(num/8));
	}
}
