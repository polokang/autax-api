package com.zhk.autaxapi.web;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.zhk.autaxapi.AuTaxProperties;
import com.zhk.autaxapi.domain.Email;
import com.zhk.autaxapi.domain.EmailRepository;
import com.zhk.autaxapi.service.MailService;


@RestController
public class MailController {
	@Autowired
	private MailService mailService;
	@Autowired
    private EmailRepository emailRepository;
	@Autowired
	private AuTaxProperties auTaxProperties;
	
	@RequestMapping(value = "/sendmail", method = RequestMethod.POST)
	public String sendMail(@RequestBody String param) throws Exception {
		HashMap<?, ?> parseMap = (HashMap<?, ?>) JSONObject.parseObject(param, HashMap.class);
		JSONObject obj = (JSONObject) parseMap.get("email");
		Email email = JSONObject.toJavaObject(obj, Email.class);
		if (email.getM_token().equals("autax")) {
			String attachPath = auTaxProperties.getSavepath();
			String attachName = email.getM_attachname();
			String attachment = attachPath + "/" + attachName;
//			mailService.sendSimpleMail(email.getM_to(),email.getM_subject(),email.getM_content());
			mailService.sendAttachmentsMail(email.getM_to(), email.getM_subject(), email.getM_content(), attachment);

			java.util.Date dt = new java.util.Date();
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String currentTime = sdf.format(dt);
			email.setM_sendtime(currentTime);
			email = emailRepository.save(email); // 此处可以获取存入数据库后的 id 了 email.getId();

			return "Mail is sent.";
		}
		return "error token code";
	}
	
	@RequestMapping(value = "/getmail", method = RequestMethod.GET)
	public String getMail() {
		return "getMail";
	}
}
