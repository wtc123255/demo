package project.util;

/** 
 *  数据库连接信息密文
 */
public class MySQLEncryption {
	//秘钥
	public static final String KEY = "88888888";
	//用户名密文
	public static final byte[] USERNAME = {109, 124, 61, 115, -123, -43, -102, 82};
	//密码密文
	public static final byte[] PASSWORD = {-5, 85, -61, 2, -49, 110, -46, -55, -49, -69, -115, 43, -108, -66, -120, -105};
}
