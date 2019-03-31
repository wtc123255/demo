package com.wangtiancheng.work;

import java.util.HashSet;
import java.util.Random;

/** 
 *
 *	随机生成一注双色球 6个红球1篮球  红球返回1-33 篮球范围1-16
    *         百度的   看不懂
 */
public class Work11 {
	public static void main(String[] args) {
	    HashSet<Integer> set = new HashSet<>();
	    Random a = new Random();
		while (set.size() < 6){
            int redBall = a.nextInt(33) + 1;
            set.add(redBall);
        }
        System.out.println("双色球中奖号码为:");
        System.out.print("红球是:");
        for (Integer i : set) {
            System.out.print(i+" ");
        }
        int blueBall = a.nextInt(16) + 1;
        System.out.println();
        System.out.println("蓝球是:"+blueBall);
	}
}
