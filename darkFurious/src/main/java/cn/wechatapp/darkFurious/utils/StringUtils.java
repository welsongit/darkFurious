package cn.wechatapp.darkFurious.utils;

/**
 * String工具类
 * @author Administrator
 *
 */
public class StringUtils {
	
	/**
	 * 判断字符串是否为空 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return str == null || "".equals(str) ? true : false;
	}
	
	/**
	 * 判断字符串是否不为空 
	 * @param str
	 * @return
	 */
	public static boolean notEmpty(String str) {
		return isEmpty(str) ? false : true;
	}
}
