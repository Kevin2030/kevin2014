package com.kevin.system;

import java.text.DecimalFormat;

/**
 * 获得jvm相关的内存信息
 * 
 * @author Kai.Zhao
 * @date Jan. 8th, 2015
 * @since 1.0
 */
public class SystemMsg {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(Runtime.getRuntime().totalMemory()/1024f/1024f)+"MB");
		System.out.println(df.format(Runtime.getRuntime().maxMemory()/1024f/1024f)+"MB");
		System.out.println(df.format(Runtime.getRuntime().freeMemory()/1024f/1024f)+"MB");
	}
}
