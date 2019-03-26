package com.lifeng.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/** 
 * @CompanyName lhfinance.com
 * @ClassName Test06.java 
 * @Package com.lifeng.demo 
 * @Description: (用一句话描述该文件做什么) 
 * @author lf  
 * @date 2019年3月1日 上午11:41:06 
 * @version V1.0.0
 *
 */
public class Test06 {
	private Logger logger = LoggerFactory.getLogger(getClass());
	public static void main(String[] args) {
		Test06 test06 = new Test06();
		test06.test();
		test06.test01(1, 0);
	}
	public void test() {
		logger.debug("循环执行开始");
		for(int i=0;i<10;i++) {
			logger.debug("循环第[{}]次",i);
		}
		logger.debug("循环执行结束");
	}
	
	public void test01(int a,int b) {
		if(b==0) {
			logger.error("被除数不能为0");
			return;
		}
		logger.debug("{}/{}={}",a,b,a/b);
	}

}
