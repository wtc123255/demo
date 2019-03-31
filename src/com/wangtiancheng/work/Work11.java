package com.wangtiancheng.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/** 
 *
 *	随机生成一注双色球 6个红球1篮球  红球返回1-33 篮球范围1-16
    *         百度的   看不懂
 */
public class Work11 {
	public static void main(String[] args) {
//	    HashSet<Integer> set = new HashSet<>();
//	    Random a = new Random();
//		while (set.size() < 6){
//            int redBall = a.nextInt(33) + 1;
//            set.add(redBall);
//        }
//        System.out.println("双色球中奖号码为:");
//        System.out.print("红球是:");
//        for (Integer i : set) {
//            System.out.print(i+" ");
//        }
//        int blueBall = a.nextInt(16) + 1;
//        System.out.println();
//        System.out.println("蓝球是:"+blueBall);
		
		System.out.println(getSsq());
	}
	
	/**
	 * 获取红球
	 * @return
	 */
	public static int getRedBall() {
		return (int)(Math.random() * 33) + 1;
	}
	
	/**
	 * 获取篮球
	 * @return
	 */
	public static int getBlueBall() {
		return (int)(Math.random() * 16) + 1;
	}
	
	
	public static String getSsq() {
		//红球数组6个
		int[] redBall = new int[6];
		//篮球1个
		int blueBall = getBlueBall();
		//循环6次
		for (int i = 0; i < redBall.length; i++) {
			//获取1-33内的一个随机数
			int num = getRedBall();
			//循环数组长度6
			for (int j = 0; j < redBall.length; j++) {
				//依次判断有没有存在生成的这个数,只有不存在赋值数组,双色球不能有重复球
				if(num != redBall[j]) {
					redBall[i] = num;
				}
			}
		}
		return "红球:"+Arrays.toString(redBall)+"\n篮球:"+blueBall;
	}
	
}
