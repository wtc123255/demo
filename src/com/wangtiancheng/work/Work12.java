package com.wangtiancheng.work;

/**
  * 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
  * 程序分析：可填在百位、十位、个位的数字都是1、2、3、4。这里要用3个for循环
  * 跟同学合作的
 */
public class Work12 {
	public static void main(String[] args) {
		int i = 0;
        int j = 0;
        int l = 0;
        int b = 0;
        for(i = 1; i <= 4; i++) {
            for(j = 1; j <= 4; j++) {
                for(l = 1; l <= 4; l++) {
                    if(i != j&& j != l && i!= l) {
                        b ++;
                        System.out.println(i*100 + j*10 + l);
                    }
                }
            }
        }
        System.out.println("总共能够组成" + b + "个数字！");
	}
}
