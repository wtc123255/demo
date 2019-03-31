package com.wangtiancheng.work;

/** 
 *
 *	随机生成一注双色球 6个红球1篮球  红球返回1-33 篮球范围1-16
 */
public class Work11 {
	public static void main(String[] args) {
		
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
}
