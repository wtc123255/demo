package com.common;

/** 
 * 基础工具类
 */
public class BaseUtils {
	/**
	 * 首字母变小写
	 * @param str
	 * @return
	 */
	public static String firstCharToLowerCase(String str) {
		char firstChar = str.charAt(0);
		if (firstChar >= 'A' && firstChar <= 'Z') {
			char[] arr = str.toCharArray();
			arr[0] += ('a' - 'A');
			return new String(arr);
		}
		return str;
	}

	/**
	 * 首字母变大写
	 * @param str
	 * @return
	 */
	public static String firstCharToUpperCase(String str) {
		char firstChar = str.charAt(0);
		if (firstChar >= 'a' && firstChar <= 'z') {
			char[] arr = str.toCharArray();
			arr[0] -= ('a' - 'A');
			return new String(arr);
		}
		return str;
	}

	/**
	 * 判断是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(final String str) {
		return (str == null) || (str.length() == 0);
	}

	/**
	 * 判断是否不为空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(final String str) {
		return !isEmpty(str);
	}

	/**
	 * 判断是否空白
	 * @param str
	 * @return
	 */
	public static boolean isBlank(final String str) {
		int strLen;
		if ((str == null) || ((strLen = str.length()) == 0))
			return true;
		for (int i = 0; i < strLen; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 判断是否不是空白
	 * @param str
	 * @return
	 */
	public static boolean isNotBlank(final String str) {
		return !isBlank(str);
	}

	/**
	 * 判断多个字符串其中任意一个是否为空
	 * @param strings
	 * @return
	 */
	public static boolean isHasEmpty(String... strings) {
		if (strings == null) {
			return true;
		}
		for (String str : strings) {
			if (isEmpty(str)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 字符串不为 null 而且不为 "" 并且等于other
	 * @param str
	 * @param other
	 * @return
	 */
	public static boolean isNotEmptyAndEquelsOther(String str, String other) {
		if (isEmpty(str)) {
			return false;
		}
		return str.equals(other);
	}


	/**
	 * 字符串不为 null 而且不为 "" 并且不等于other
	 * @param str
	 * @param other
	 * @return
	 */
	public static boolean isNotEmptyAndNotEquelsOther(String str, String... other) {
		if (isEmpty(str)) {
			return false;
		}
		for (int i = 0; i < other.length; i++) {
			if (str.equals(other[i])) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 字符串不等于other
	 * @param str
	 * @param other
	 * @return
	 */
	public static boolean isNotEquelsOther(String str, String... other) {
		for (int i = 0; i < other.length; i++) {
			if (other[i].equals(str)) {
				return false;
			}
		}
		return true;
	}
}
