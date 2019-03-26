package com.lifeng.demo;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @CompanyName lhfinance.com
 * @ClassName Test05.java 
 * @Package com.lifeng.demo 
 * @Description: (用一句话描述该文件做什么) 
 * @author lf  
 * @date 2019年2月22日 上午9:40:14 
 * @version V1.0.0
 *
 */
public class Test05{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double [] arr = new double[5];
		for(int i=0;i<arr.length;i++) {
			System.out.println("请输入第"+(i+1)+"个数的值:");
			arr[i] = scanner.nextDouble();
		}

		System.out.println("排序前的值:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}

		//冒泡排序
		for(int i=0;i<arr.length-1;i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]){
					int temp=(int) arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

		//查看数组
		System.out.println();
		System.out.println("排序后的值:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		System.out.println("最大值:"+arr[arr.length-1]);
		System.out.println("最小值:"+arr[0]);

	}
}
