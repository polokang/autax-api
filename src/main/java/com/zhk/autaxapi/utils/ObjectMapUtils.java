package com.zhk.autaxapi.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

public class ObjectMapUtils {
	/**
	 * 目标实体转换为map集合
	 * 
	 * @param object   对象
	 * @return   map   集合
	 * @throws Exception
	 */
	public static LinkedHashMap<String, String> Objcet2Map(Object obj) throws Exception {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		Class<? extends Object> clazz = obj.getClass();
		// 获取所有属性
		Field[] fields = clazz.getDeclaredFields();
		// 迭代属性数组
		for (Field field : fields) {
			// 获取属性名
			String name = field.getName();
			// 拼接get方法名
			String methodName = "get" + name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
			// 获取方法
			Method method = clazz.getDeclaredMethod(methodName);
			// 执行方法
			Object value = method.invoke(obj);
			if (value == null) {
				value = "";
			}

			map.put(name, value.toString());
		}
		return map;
	}
}
