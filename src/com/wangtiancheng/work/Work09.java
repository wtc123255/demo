package com.wangtiancheng.work;

/** 
  * @Email alifenga@163.com
  * @ClassName Work09.java 
  * @Package com.wangtiancheng.work 
  * @Description: (用一句话描述该文件做什么) 
  * @author lf  
  * @date 2019年3月30日 下午6:00:04 
  * @version V1.0.0
  *
  * 假如有个人叫老王,他有100万的遗产,有一天他死了,他儿子小王继承了100万遗产,
  * 后来他工作赚了20万,娶老婆用了40万,剩余80万
  * 用继承实现小王是如何继承老王的遗产并消费的,手动帮小王调用赚钱和娶老婆的方法
  * 打印小王继承遗产时候的金额,和继承使用后的金额
  */
public class Work09 {
	public static void main(String[] args) {
		Xw xw = new Xw();
		//手动帮小王调用赚钱和娶老婆的方法
		xw.a();
		xw.b();
	}
}

/**
 * 老王
  * @Email alifenga@163.com
  * @ClassName Work09.java 
  * @Package com.wangtiancheng.work 
  * @Description: (用一句话描述该文件做什么) 
  * @author lf  
  * @date 2019年3月30日 下午6:03:02 
  * @version V1.0.0
  *
 */
class Lw{
	//钱100万
	public int money = 1000000;
}

/**
 * 小王
  * @Email alifenga@163.com
  * @ClassName Work09.java 
  * @Package com.wangtiancheng.work 
  * @Description: (用一句话描述该文件做什么) 
  * @author lf  
  * @date 2019年3月30日 下午6:03:21 
  * @version V1.0.0
  *
 */
class Xw extends Lw{
	public Xw() {
		System.out.println("继承时金额:"+money);
	}
	
	/**
	 * 赚钱方法
	 */
	public void a() {
		money += 200000;
		System.out.println("赚钱后:"+money);
	}
	
	/**
	 * 娶老婆
	 */
	public void b() {
		money -= 400000;
		System.out.println("娶老婆后:"+money);
	}
}

