package com.lifeng.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/** 
 *
 */
public class Test20 {
	public static void main(String[] args) throws Exception {
		Class c = T.class;
		String string = c.getName();
		Field[] field1 = c.getDeclaredFields();
		Method[] method1 = c.getDeclaredMethods();
		System.out.println("类名:"+string);
		for (Method method : method1) {
			System.out.println("方法名:"+method.getName());
		}
		for (Field field : field1) {
			System.out.println("属性名:"+field.getName());
		}
		Constructor<T> cons = c.getConstructor(String.class,Integer.class);
		T t = cons.newInstance("张三",20);
		System.out.println(t);
	}

	@Override
	public String toString() {
		return "Test20 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
class T{
	private String name;
	private Integer age;
	public T() {
	}
	public T(String name,Integer age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void print() {
		System.out.println("1");
	}
	@Override
	public String toString() {
		return "T [name=" + name + ", age=" + age + "]";
	}
	
}
