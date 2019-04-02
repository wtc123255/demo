package com.lifeng.demo;

/** 
 * 测试
 */
public class Test18 {
	public static void main(String[] args) {
		int[]arr = getArray();
		int value = 8802012;
		long startTime1 = System.currentTimeMillis();
		System.out.println(getIndex(arr, value));
		long entTime1 = System.currentTimeMillis();
		System.out.println("普通查找耗时:"+(entTime1-startTime1));
		
		long startTime2 = System.currentTimeMillis();
		System.out.println(binarySerach(arr, value));
		long entTime2 = System.currentTimeMillis();
		System.out.println("二分查找耗时:"+(entTime2-startTime2));
		
	}
	
	
	/**
	 * 普通查找下标
	 * @param arr
	 * @param value
	 * @return
	 */
	public static int getIndex(int []arr,int value) {
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
	}
	
	/**
	 * 二分查找下标
	 * @param array
	 * @param key
	 * @return
	 */
	public static int binarySerach(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] == key) {
				return mid;
			}
			else if (array[mid] < key) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	
	/**
	 * 生成数组
	 * @return
	 */
	public static int[] getArray() {
		int []arr = new int[15464691];
		for (int i = 1; i <= 15464691; i++) {
			arr[i-1] = i;
		}
		return arr;
	}
}
