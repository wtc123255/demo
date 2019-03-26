package com.lifeng.test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/** 
 * @CompanyName lhfinance.com
 * @ClassName StudentTest.java 
 * @Package com.lifeng.test 
 * @Description: (用一句话描述该文件做什么) 
 * @author lf  
 * @date 2019年3月6日 下午4:22:44 
 * @version V1.0.0
 *
 */
public class StudentTest {
	public static void main(String[] args) {
		//初始化赋值学生列表并计算平均分和总分
		List<Student> students = initStudents();
		
		//获取总分最高的学生
		Student student = Calculation(students);
		
		//打印所有学生成绩和最高分学生的信息
		printStudent(students, student);
	}

	/**
	 * 初始化
	 */
	public static List<Student> initStudents() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生人数:");
		int num = scanner.nextInt();
		List<Student> list = new ArrayList<Student>();
	    DecimalFormat df = new DecimalFormat(".00");
		for(int i=0;i<num;i++) {
			Student student = new Student();
			System.out.println("请输入第"+(i+1)+"学生的名字:");
			student.setName(scanner.next());
			System.out.println("请输入第"+(i+1)+"学生的语文成绩:");
			student.setYw(scanner.nextFloat());
			System.out.println("请输入第"+(i+1)+"学生的数学成绩:");
			student.setSx(scanner.nextFloat());
			System.out.println("请输入第"+(i+1)+"学生的英语成绩:");
			student.setYy(scanner.nextFloat());

			float sum = student.getYw()+student.getSx()+student.getYy();
			student.setPj(Float.parseFloat(df.format(sum/3)));
			student.setSum(sum);
			list.add(student);
		}
		return list;
	}

	/**
	 * 排序
	 * @param list
	 */
	public static Student Calculation(List<Student> list) {
		Collections.sort(list, new Comparator<Student>() {  
			@Override  
			public int compare(Student o1, Student o2) {  
				// 按照总成绩进行降序排列  
				if (o1.getSum() < o2.getSum()) {  
					return 1;  
				}  
				if (o1.getSum() == o2.getSum()) {  
					return 0;  
				}  
				return -1;  
			}  
		});  
		return list.get(0);
	}
	
	/**
	 * 打印
	 * @param students
	 * @param student
	 */
	public static void printStudent(List<Student> students,Student student) {
		System.out.println("姓名\t语文\t数学\t英语\t平均\t总成绩");
		for (Student stu : students) {
			System.out.println(stu.getName()+"\t"+stu.getYw()+
					"\t"+stu.getSx()+"\t"+stu.getYy()+"\t"+stu.getPj()+"\t"+stu.getSum());
		}
		System.out.println();
		System.out.println("总分最高的是:"+student.getName()+",总分:"+student.getSum());
	}
}
