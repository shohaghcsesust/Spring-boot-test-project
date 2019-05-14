package com.shohagh.springboottest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shohagh.springboottest.mail.MailSender;

@RestController
public class MailController {

	private MailSender mailSender;
	
	@Autowired
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	@RequestMapping("/mail")
	public String mail() {

		mailSender.send("mail@example.com", "A test mail", "Body of the test mail");

		return "Mail has been sent";
	}
}