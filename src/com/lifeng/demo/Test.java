package com.lifeng.demo;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Test{


	public static void test(String str) {
		BufferedImage image = new BufferedImage(1000,20,BufferedImage.TYPE_INT_RGB);
		Graphics2D g = image.createGraphics();
		g.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		g.drawString(str,2,image.getHeight() - 2);
		int[] p = image.getRGB(0,0,image.getWidth(),image.getHeight(),new int[image.getWidth()*image.getHeight()],0,image.getWidth());
		for(int i=0;i<image.getHeight();i++) {
			for(int j=0;j<image.getWidth();j++) {//(i%2==0?"@":"@")
				System.err.print(p[i*image.getWidth()+j]==-1?"@":" "+(j==image.getWidth()-1?"\n":""));
			}
		}
	}
	public static void main(String[] args) {
		test("1");
		new Test();
	}
}

