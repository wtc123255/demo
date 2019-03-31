package com.wangtiancheng.work;

import java.util.Scanner;

/** 
  * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
  * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
  * 程序分析：兔子的规律为数列1,1,2,3,5,8,13,21….
  *  做这种题目，最好的做法就是找出规律，跟高中的数列一样
  *   本题有：a[n]=a[n-1]+a[n-1],而第一第二项都知道了，后面的值也可以求得
 *时间不够了   先去上晚自习  回来再改
 */
public class Work10 {
	public static void main(String[] args) {
		System.out.println("请输入想要查看兔子数量的月份：");
        Scanner scan=new Scanner(System.in);
        int yue=countOfRabbit(yue );
        yue=scan.yue();
        System.out.println("第"+yue+"月的兔子数量是："+yue);
    }
        public static int countOfRabbit(int intCode){
        int scan = 0;
		if(scan==1 || scan==2){
        return 1;
        }else{
         int yue = 0;
		return countOfRabbit(yue-2)+countOfRabbit(yue-1);
        }
    }
}
