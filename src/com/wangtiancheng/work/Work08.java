package com.wangtiancheng.work;

import java.util.Scanner;

/** 
 * @Email alifenga@163.com
 * @ClassName Work08.java 
 * @Package com.wangtiancheng.work 
 * @Description: (用一句话描述该文件做什么) 
 * @author lf  
 * @date 2019年3月27日 上午11:53:28 
 * @version V1.0.0
 *
 * .题目：输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。
 */
public class Work08 {
	public static void main(String[] args) {
		int abcCount=0;//英文字母个数
		int spaceCount=0;//空格键个数
		int numCount=0;//数字个数
		int otherCount=0;//其他字符个数
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入任意字符串:");
		String str=scanner.nextLine();
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(Character.isLetter(ch[i])){
				//判断是否字母
				abcCount++;
			}else if(Character.isDigit(ch[i])){
				//判断是否数字
				numCount++;
			}else if(Character.isSpaceChar(ch[i])){
				//判断是否空格键
				spaceCount++;
			}else{
				//以上都不是则认为是其他字符
				otherCount++;
			}
		}
		
		System.out.println(str+"中有"+abcCount+"字母"+spaceCount+"空格"+numCount+"数字"+otherCount+"其他字符");
		
		abcCount=0;//英文字母个数
		spaceCount=0;//空格键个数
		numCount=0;//数字个数
		otherCount=0;//其他字符个数
        int len=str.length();
        for(int i=0;i<len;i++){
            char c=str.charAt(i);
            if(c>=65&&c<=122) {
            	abcCount++;
            }else if(c>=48&&c<=57) {
            	numCount++;
            }else if(c==32) {
            	spaceCount++;
            }else {
            	otherCount++;
            }
        }
		
		System.out.println(str+"中有"+abcCount+"字母"+spaceCount+"空格"+numCount+"数字"+otherCount+"其他字符");
	}
}