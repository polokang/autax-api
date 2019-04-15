package com.zhk.autaxapi.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.zhk.autaxapi.domain.ExcelEntity;
import com.zhk.autaxapi.domain.OrderIndv;
import com.zhk.autaxapi.utils.ObjectMapUtils;

@Service
public class TaxOrderService {

	public ArrayList<ExcelEntity> getExcellFromOrderIndv(OrderIndv order) throws Exception {
		ArrayList<ExcelEntity> list = new ArrayList<ExcelEntity>();
		Map<String, String> map = ObjectMapUtils.Objcet2Map(order);
		for (Map.Entry<String, String> entry : map.entrySet()) {
//			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			list.add(new ExcelEntity(entry.getKey(), entry.getValue()));
		}

		return list;
	}
}
