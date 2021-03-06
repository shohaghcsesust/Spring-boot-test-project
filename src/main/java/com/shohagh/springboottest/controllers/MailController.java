package com.shohagh.springboottest.controllers;

import javax.mail.MessagingException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shohagh.springboottest.mail.MailSender;

@RestController
public class MailController {

	private MailSender mailSender;

	public MailController(MailSender smtpMailSender) {
		this.mailSender = smtpMailSender;
	}

	@RequestMapping("/mail")
	public String mail() throws MessagingException {

		mailSender.send("shahinuzzaman.shawon@bjitgroup.com", "A test mail", "Body of the test mail");

		return "Mail has been sent";
	}
}