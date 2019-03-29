package com.wangtiancheng.work;

/** 
  * @Email alifenga@163.com
  * @ClassName Work07.java 
  * @Package com.wangtiancheng.work 
  * @Description: (用一句话描述该文件做什么) 
  * @author lf  
  * @date 2019年3月27日 上午11:49:45 
  * @version V1.0.0
  *
  *
  * .编写程序解决“百钱买百鸡”问题。
  * .公鸡五钱一只，母鸡三钱一只，小鸡一钱三只，现有百钱欲买百鸡，共有多少种买法？
  */
public class Work07 {
	public static void main(String[] args) {
		int i=0;
		//公鸡循环 最多买100/5只
		for(int g=0;g<=20;g++){
            for(int m=0;m<=33;m++){
                for(int x=0;x<=100-g-m;x++){
                    if(x % 3==0 && 5*g+m*3+x/3 == 100 && g+m+x == 100){
                        System.out.println("公鸡:"+g+",母鸡:"+m+"小鸡:"+x+"只");
                        i++;
                    }
                }
            }
        }
		System.out.println(i+"种");
	}
}
