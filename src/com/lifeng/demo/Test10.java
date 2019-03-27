package com.lifeng.demo;

/** 
  * @ClassName Test10.java 
  * @Package com.lifeng.demo 
  * @Description: (用一句话描述该文件做什么) 
  * @author lf  
  * @date 2019年3月8日 下午11:00:32 
  * @version V1.0.0
  *
  */
public class Test10 {
	public static void main(String[] args) {
		Runtime rt=Runtime.getRuntime();
		try{
			rt.exec("shutdown.exe -a");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
