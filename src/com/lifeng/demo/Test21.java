package com.lifeng.demo;

import java.io.File;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

/** 
 *
 */
public class Test21 {
	public static void main(String[] args) {
		//图片地址
		String inputImagePath = System.getProperty("user.dir")+"/img/1.jpg";
		// 指定读出的图片路径和输出的文件
		String outputImageFile = System.getProperty("user.dir")+"/imager/test.jpg";

		//加载lib,这个lib的名称
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

		//读取图像的 mat信息
		Mat image = Imgcodecs.imread(new File(inputImagePath).getAbsolutePath());

		//初始化人脸识别类
		MatOfRect faceDetections = new MatOfRect();
		//添加识别模型
		String xmlPath = Test21.class.getClassLoader().getResource("cascade_storage.xml").getPath().substring(1);
		CascadeClassifier faceDetector = new CascadeClassifier(xmlPath);
		//识别脸
		faceDetector.detectMultiScale(image, faceDetections);

		// 画出脸的位置
		for (Rect rect : faceDetections.toArray()) {
			Imgproc.rectangle(image, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 0, 255), 2);
		}

		// 写入到文件
		Imgcodecs.imwrite(outputImageFile, image);

		System.out.print("图片人脸识别成功");
	}
}
