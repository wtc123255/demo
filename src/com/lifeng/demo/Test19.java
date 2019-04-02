package com.lifeng.demo;

/** 
 * 二分查找是一个基础的算法，也是面试中常考的一个知识点。
 * 二分查找就是将查找的键和子数组的中间键作比较，如果被查找的键小于中间键，
 * 就在左子数组继续查找；如果大于中间键，就在右子数组中查找，否则中间键就是要找的元素。
 */
public class Test19 {
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,5,4,3,2,1};
		System.out.println(binarySerach(arr, 3));
	}


	/**
	 * (二分查找，找到该值在数组中的下标，否则为-1)
	 * 
	 * 每次移动left和right指针的时候，需要在mid的基础上+1或者-1， 防止出现死循环， 程序也就能够正确的运行。
	 * 注意：代码中的判断条件必须是while (left <= right)，否则的话判断条件不完整，
	 * 比如：array[3] = {1, 3, 5};待查找的键为5，此时在(low < high)条件下就会找不到，
	 * 因为low和high相等时，指向元素5，但是此时条件不成立，没有进入while()中。
	 */
	public static int binarySerach(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;
		// 这里必须是 <=
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
	 * (查找第一个与key相等的元素)
	 * 
	 * 查找第一个相等的元素，也就是说等于查找key值的元素有好多个，返回这些元素最左边的元素下标。
	 * @param array
	 * @param key
	 * @return
	 */
	public static int findFirstEqual(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;
		// 这里必须是 <=
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] >= key) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		if (left < array.length && array[left] == key) {
			return left;
		}
		return -1;
	}

	/**
	 * (查找最后一个与key相等的元素)
	 * 
	 * 查找最后一个相等的元素，也就是说等于查找key值的元素有好多个，返回这些元素最右边的元素下标
	 * @param array
	 * @param key
	 * @return
	 */
	public static int findLastEqual(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;
		// 这里必须是 <=
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] <= key) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		if (right >= 0 && array[right] == key) {
			return right;
		}
		return -1;
	}

	/**
	 * (查找最后一个等于或者小于key的元素)
	 * 
	 * 查找最后一个等于或者小于key的元素，也就是说等于查找key值的元素有好多个，
	 * 返回这些元素最右边的元素下标；如果没有等于key值的元素，则返回小于key的最右边元素下标。
	 * @param array
	 * @param key
	 * @return
	 */
	public static int findLastEqualSmaller(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;
		// 这里必须是 <=
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] > key) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return right;
	}

	/**
	 * (查找最后一个小于key的元素)
	 * 
	 * 查找最后一个小于key的元素，也就是说返回小于key的最右边元素下标。
	 * @param array
	 * @param key
	 * @return
	 */
	public static int findLastSmaller(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;
		// 这里必须是 <=
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] >= key) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return right;
	}

	/**
	 * (查找第一个等于或者大于key的元素)
	 * 
	 * 查找第一个等于或者大于key的元素，也就是说等于查找key值的元素有好多个，
	 * 返回这些元素最左边的元素下标；如果没有等于key值的元素，则返回大于key的最左边元素下标。
	 * @param array
	 * @param key
	 * @return
	 */
	public static int findFirstEqualLarger(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;
		// 这里必须是 <=
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] >= key) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return left;
	}

	/**
	 * (查找第一个大于key的元素)
	 * 
	 * 查找第一个等于key的元素，也就是说返回大于key的最左边元素下标。
	 * @param array
	 * @param key
	 * @return
	 */
	public static int findFirstLarger(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;
		// 这里必须是 <=
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] > key) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return left;
	}
}
