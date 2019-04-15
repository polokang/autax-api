package com.zhk.autaxapi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
@Entity
public class Email {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String m_to;
	@Column(nullable = false)
	private String m_subject;
	@Column(nullable = false)
	private String m_content;
	@Column(nullable = false)
	private String m_token;
	@Column(nullable = false)
	private String m_sendtime;
	
	public Email() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getM_to() {
		return m_to;
	}

	public void setM_to(String m_to) {
		this.m_to = m_to;
	}

	public String getM_subject() {
		return m_subject;
	}

	public void setM_subject(String m_subject) {
		this.m_subject = m_subject;
	}

	public String getM_content() {
		return m_content;
	}

	public void setM_content(String m_content) {
		this.m_content = m_content;
	}

	public String getM_token() {
		return m_token;
	}

	public void setM_token(String m_token) {
		this.m_token = m_token;
	}

	public String getM_sendtime() {
		return m_sendtime;
	}

	public void setM_sendtime(String m_sendtime) {
		this.m_sendtime = m_sendtime;
	}

	@Override
	public String toString() {
		return "Email [id=" + id + ", m_to=" + m_to + ", m_subject=" + m_subject + ", m_content=" + m_content
				+ ", m_token=" + m_token + ", m_sendtime=" + m_sendtime + "]";
	}

	
	
}
