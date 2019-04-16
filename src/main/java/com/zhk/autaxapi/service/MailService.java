package com.zhk.autaxapi.service;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class MailService {
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
    public Environment env; // 当前环境的application.properties的配置
	
	public void sendSimpleMail(String to,String subject, String content) throws Exception {
		String fromUser = env.getProperty("spring.mail.username");
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(fromUser);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(content);
		mailSender.send(message);
	}
	
	public void sendAttachmentsMail(String to,String subject, String content, String attchment) throws Exception {
		String fromUser = env.getProperty("spring.mail.username");
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
		helper.setFrom(fromUser);
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setText(content);

		FileSystemResource file = new FileSystemResource(new File(attchment));
		helper.addAttachment("attchment.xls", file);

		mailSender.send(mimeMessage);

	}
}
