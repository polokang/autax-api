package com.zhk.autaxapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AuTaxProperties {
	@Value("${com.zhk.autaxapi.excel.savepath}")
	private String savepath;

	public String getSavepath() {
		return savepath;
	}

	public void setSavepath(String savepath) {
		this.savepath = savepath;
	}
	
}
