package cn.lovemm.vo;


/**
 * 系统缓存类型定义
 * @author pangpj
 *
 */
public enum CacheType{
	
	DATADIC("datadic", "字典表缓存名称", "通用"),
	RMS_MENU("rms_menu", "菜单权限缓存", "后台管理系统"),
	RMS_PWD_FAILED_TIMES("rms_pwd_failed_times", "密码错误次数缓存", "后台管理系统"),
	BLOG_MENU("blog_menu", "菜单权限缓存", "博客系统");
	private String code;
	
	private String memo;
	
	private String owner;

	private CacheType (String code, String memo, String owner) {
		this.code = code;
		this.memo = memo;
		this.owner = owner;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public static CacheType getCode(String code) {
		for (CacheType c : CacheType.values()) {
			if (c.getCode().equals(code)) {
				return c;
			}
		}
		return null;
	}
}
