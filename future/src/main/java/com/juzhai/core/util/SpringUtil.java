/* 
 * SpringUtil.java * 
 * Copyright 2008 Shanghai TuDou.  
 * All rights reserved. 
 */

package com.juzhai.core.util;

import org.springframework.context.ApplicationContext;

public class SpringUtil {

	/**
	 * spring的上下文
	 */
	private static ApplicationContext ctx;

	/**
	 * 根据指定bean名称，获取对应的实例对象
	 * 
	 * @param name
	 *            bean的名称
	 * @return 对应bean的实例对象
	 */
	public static Object getBean(String name) {
		if (ctx == null) {
			throw new RuntimeException("spring 上下文对象未初始化，无法完成bean的查找！");
		}
		return ctx.getBean(name);
	}

	/**
	 * @return the ctx
	 */
	public static ApplicationContext getApplicationContext() {
		return ctx;
	}

	/**
	 * @param ctx
	 *            the ctx to set
	 */
	public static void setApplicationContext(
			ApplicationContext applicationContext) {
		ctx = applicationContext;
	}

}
