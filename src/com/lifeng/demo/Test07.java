package com.lifeng.demo;

/** 
 * @ClassName Test07.java 
 * @Package com.lifeng.demo 
 * @Description: (用一句话描述该文件做什么) 
 * @author lf  
 * @date 2019年3月5日 下午3:57:04 
 * @version V1.0.0
 *
 */
public class Test07 {
	public static void main(String[] args) {
		int[] ints = {1,3,5,7,9,2,4,6,8,10};
		SortThread[] sortThreads = new SortThread[ints.length];
		for (int i = 0; i < sortThreads.length; i++) {
			sortThreads[i] = new SortThread(ints[i]);
		}
		for (int i = 0; i < sortThreads.length; i++) {
			sortThreads[i].start();
		}
	}
}

class SortThread extends Thread{
	int ms = 0;
	public SortThread(int ms){
		this.ms = ms;
	}
	public void run(){
		try {
			sleep(ms*10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName()+"-----"+ms);
	}
}
