package cn.lovemm.controller.config.gt;


/**
 * GeetestWeb配置文件
 * @author pangpj 2017年04月18日16:46:13
 */
public class GeetestConfig {

	// 填入自己的captcha_id和private_key
	private static final String geetest_id = "47b166e2b679be3bd052edf09a49dc2d";
	private static final String geetest_key = "1289da8f7830b4fa4e54f7bca1acdd8d";
	private static final boolean newfailback = true;

	public static final String getGeetest_id() {
		return geetest_id;
	}

	public static final String getGeetest_key() {
		return geetest_key;
	}
	
	public static final boolean isnewfailback() {
		return newfailback;
	}

}
