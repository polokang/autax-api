package com.zhk.autaxapi.web;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.zhk.autaxapi.AuTaxProperties;
import com.zhk.autaxapi.domain.ExcelEntity;
import com.zhk.autaxapi.domain.OrderBusi;
import com.zhk.autaxapi.domain.OrderBusiRepository;
import com.zhk.autaxapi.domain.OrderIndv;
import com.zhk.autaxapi.domain.OrderIndvRepository;
import com.zhk.autaxapi.service.TaxOrderService;
import com.zhk.autaxapi.utils.ExcelUtils;

@RestController
@RequestMapping(value = "/order")
public class TaxOrderController {
	@Autowired
    private OrderIndvRepository orderIndvRepository;
	@Autowired
    private OrderBusiRepository orderBusiRepository;
	@Autowired
	private TaxOrderService taxOrderService;
	@Autowired
	private AuTaxProperties auTaxProperties;
	
	
	@ResponseBody
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveOrder(@RequestBody String param) throws Exception {
		LinkedHashMap<?,?> parseMap = (LinkedHashMap<?,?>)JSONObject.parseObject(param, LinkedHashMap.class);
		JSONObject obj =(JSONObject) parseMap.get("form");
		OrderIndv order = JSONObject.toJavaObject(obj,OrderIndv.class);
		java.util.Date dt = new java.util.Date();
		java.text.SimpleDateFormat sdf =
		new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = sdf.format(dt);
		order.setApplyTime(currentTime);
		order.setState("1");
		order = orderIndvRepository.save(order);
		
		Integer baseNum = 100000 + order.getId();
		String excelName = baseNum.toString()+".xls";
		ArrayList<ExcelEntity> list = taxOrderService.getExcellFromOrderIndv(order);
		ExcelUtils.saveExcel(list, auTaxProperties.getSavepath(), excelName);
		return excelName;
	}
	
	@ResponseBody
	@RequestMapping(value = "/saveBusi", method = RequestMethod.POST)
	public String saveBusiOrder(@RequestBody String param) throws Exception {
		LinkedHashMap<?,?> parseMap = (LinkedHashMap<?,?>)JSONObject.parseObject(param, LinkedHashMap.class);
		JSONObject obj =(JSONObject) parseMap.get("cform");
		OrderBusi cOrder = JSONObject.toJavaObject(obj,OrderBusi.class);
		java.util.Date dt = new java.util.Date();
		java.text.SimpleDateFormat sdf =
		new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = sdf.format(dt);
		cOrder.setApplyTime(currentTime);
		cOrder.setState("1");
		cOrder = orderBusiRepository.save(cOrder);
		
		Integer baseNum = 900000 + cOrder.getId();
		String excelName = baseNum.toString()+".xls";
		ArrayList<ExcelEntity> list = taxOrderService.getExcellFromOrderBusi(cOrder);
		ExcelUtils.saveExcel(list, auTaxProperties.getSavepath(), excelName);
		return excelName;
	}
}
