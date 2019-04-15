package com.zhk.autaxapi.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class ExcelEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	@Excel(name = "名称", width = 30, isImportField = "true_st")
	private String name;

	@Excel(name = "内容", width = 120 , isImportField = "true_st")
	private String content;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public ExcelEntity() {
		super();
	}

	public ExcelEntity(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}
}
