package cn.lovemm.util;


/**
 * String 工具类
 * @author pangpj
 *
 */
public class StringUtil {
	
	/**
	 * 字符串左边补零
	 * @param oriStr 原始字符串
	 * @param length 字符串总长度
	 * @return
	 */
	public static String leftZero (String oriStr, int length) {
		if (oriStr == null) {
			return null;
		}
		int zeroLength = length - oriStr.length();
		for (int i = 0; i < zeroLength; i++) {
			oriStr = "0" + oriStr;
		}
		return oriStr;
	}
	
	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty (String str) {
		return str == null || "".equals(str.trim());
	}
	
	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty (String str) {
		return str != null && !"".equals(str.trim());
	}
	
	/**
	 * null 转 ''
	 * @param str
	 * @return
	 */
	public static String null2Empty(String str) {
		return str == null ? "" : str.trim();
	}
}
