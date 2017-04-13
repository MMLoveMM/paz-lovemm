package cn.lovemm.util;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.hash.Sha256Hash;

/**
 * 密码相关工具
 * @author sonta
 */
public class PwdUtil {

	/**
	 * 密码加密方法
	 * @param data  密码明文
	 * @return		密码摘要
	 */
	public static String getPwd(String data){
		// 先对密码进行base64处理
		String salt = Base64.encodeToString(data.getBytes());
		// sha256hash
		String md5 = new Sha256Hash(data, salt).toString();
		return md5;
	}
}
