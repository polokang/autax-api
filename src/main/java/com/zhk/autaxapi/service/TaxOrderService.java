package com.zhk.autaxapi.service;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhk.autaxapi.domain.ExcelEntity;
import com.zhk.autaxapi.domain.OrderIndv;
import com.zhk.autaxapi.utils.ObjectMapUtils;

@Service
public class TaxOrderService {
	@Autowired  
	private OrderIndv orderProperties;
	public ArrayList<ExcelEntity> getExcellFromOrderIndv(OrderIndv order) throws Exception {
		ArrayList<ExcelEntity> list = new ArrayList<ExcelEntity>();
		Map<String, String> map = ObjectMapUtils.Objcet2Map(order);
		Class<? extends Object> clazz = orderProperties.getClass();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String name = entry.getKey();
			String methodName = "get" + name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
			Method method = clazz.getDeclaredMethod(methodName);
			Object value = method.invoke(orderProperties);
			if (value == null) {
				value = "序号";
			}
			list.add(new ExcelEntity( value.toString() , entry.getValue()));
		}

		return list;
	}
}
