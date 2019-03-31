package com.wangtiancheng.work;

import java.util.Scanner;

/**
 * 	输入一个字符判断是否回文串  如abcdcba,12321 上海自来水来自海上  是回文串 正反读都是一样
<<<<<<< HEAD
 * 正好记得书上有判定回文的方法   就抄来了
=======
 * 
 * 
 *  最简单实现思路:
 *  StringBuffer sb = new StringBuffer(str);  
 *  sb.reverse();// 将Str中的字符串倒置 
 *  字符串倒置后去比较原字符串内容是否相同
 * 
>>>>>>> branch 'master' of https://github.com/wtc123255/demo.git
 */
public class Work13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try{
		System.out.println("输入字符：:");
		String string ;
		StringBuffer integerBuffer1 = new StringBuffer(input.next());
		string = integerBuffer1.toString();
		if(string.equals(integerBuffer1.reverse().toString())){
			System.out.println(string+"是回文");
		}
		else{
			System.out.println(string+"不是回文");
		}
		}finally{
			input.close();
		}
	}
}
