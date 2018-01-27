package com.rcp.smartHome.resources;

import org.eclipse.osgi.util.NLS;
/**
 * 字符串变量资源
 * @author Administrator
 *
 */
public class Messages extends NLS {
	
	private static final String BUNDLE_NAME = "messages";
	
	static{
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	/**
	 * for system
	 */
	public static String SOFT_NAME;
	
	/**
	 * for menu
	 */
	public static String DEVICE_REGIST;
	public static String DEVICE_SEARCH;
	
	/**
	 * for dialog
	 */

}
