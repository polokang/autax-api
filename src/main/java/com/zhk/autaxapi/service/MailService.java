package com.zhk.autaxapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailService {
	@Autowired
	private JavaMailSender mailSender;
	public void sendSimpleMail(String to,String subject, String content) throws Exception {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("hunter.zhou.au@gmail.com");
		message.setTo(to);
		message.setSubject(subject);
		message.setText(content);
		mailSender.send(message);
	}
}
